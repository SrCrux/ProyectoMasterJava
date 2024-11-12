package com.masterjava.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.masterjava.model.Empresa;
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public interface IEmpresa {

	List<Empresa> listarEmpresas();

	Empresa buscarEmpresa(int idEmpresa);

	ResponseEntity<Empresa> insertarEmpresa(Empresa empresa);

	void eliminarEmpresa(int idEmpresa);

}
