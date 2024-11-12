package com.masterjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masterjava.model.Empresa;
import com.masterjava.repository.EmpresaRepository;

@Service
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class EmpresaImpl implements IEmpresa {
	@Autowired
	EmpresaRepository repository;

	@Override
	public List<Empresa> listarEmpresas() {
		return repository.findAll();
	}

	@Override
	public Empresa buscarEmpresa(int idEmpresa) {
		return repository.findById(idEmpresa).orElse(null);
	}

	@Override
	public ResponseEntity<Empresa> insertarEmpresa(Empresa empresa) {
		List<Empresa> listaEmpresas = repository.findAll();
		for (Empresa e : listaEmpresas) {
			if (e.getNombre().equals(empresa.getNombre())) {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		}
		return new ResponseEntity<Empresa>(repository.save(empresa), HttpStatus.OK);
	}

	@Override
	public void eliminarEmpresa(int idEmpresa) {
		repository.deleteById(idEmpresa);
	}
}
