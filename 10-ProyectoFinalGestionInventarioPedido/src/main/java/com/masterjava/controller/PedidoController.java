package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Pedido;
import com.masterjava.service.IPedido;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/pedidos")
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class PedidoController {

	@Autowired
	IPedido service;

	@Operation(summary = "Listar pedidos por empresa", description = "Listar todos los pedidos realizados por una empresa mediante su ID", responses = {
			@ApiResponse(responseCode = "200", description = "Lista devuelta con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@GetMapping(value = "{idEmpresa}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> listarPedidosPorEmpresa(@PathVariable int idEmpresa) {
		return service.listarPedidosPorEmpresa(idEmpresa);
	}

	@Operation(summary = "Realizar Pedido", description = "Realiza un pedido en la base de datos y actualiza el stock en la tabla productos", responses = {
			@ApiResponse(responseCode = "200", description = "Realización de pedido con éxito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@PostMapping
	public void realizarPedido(@RequestBody Pedido pedido) {
		service.realizarPedido(pedido);
	}
}
