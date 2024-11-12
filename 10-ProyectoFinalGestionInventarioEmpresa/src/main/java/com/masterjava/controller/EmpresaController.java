package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Empresa;
import com.masterjava.service.IEmpresa;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/empresas")
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class EmpresaController {
	@Autowired
	IEmpresa service;

	@Operation(summary = "Listar empresas", description = "Ver todas las empresas de la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Muestra empresas con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Empresa> listarEmpresas() {
		return service.listarEmpresas();
	}

	@Operation(summary = "Buscar Empresa", description = "Buscar empresa por ID", responses = {
			@ApiResponse(responseCode = "201", description = "Muestra empresa con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el id no existe") })
	@GetMapping(value = "{idEmpresa}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> buscarEmpresa(@PathVariable int idEmpresa) {
		if (service.buscarEmpresa(idEmpresa) != null) {
			return new ResponseEntity<Empresa>(service.buscarEmpresa(idEmpresa), HttpStatus.OK);
		} else {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}
	}

	@Operation(summary = "Insertar Empresa", description = "Insertar empresa por parametros en el body", responses = {
			@ApiResponse(responseCode = "201", description = "Ingreso empresa con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: la empresa ya existe") })
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Empresa> insertarEmpresa(@RequestBody Empresa empresa) {
		return service.insertarEmpresa(empresa);
	}

	@Operation(summary = "Eliminar Empresa", description = "Eliminar empresa por su ID", responses = {
			@ApiResponse(responseCode = "201", description = "Eliminación de empresa con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: la empresa no existe") })
	@DeleteMapping(value = "{idEmpresa}")
	public void eliminarEmpresa(@PathVariable int idEmpresa) {
		service.eliminarEmpresa(idEmpresa);
	}
}
