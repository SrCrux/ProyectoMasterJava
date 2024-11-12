package com.masterjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masterjava.model.Producto;
import com.masterjava.service.IProducto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/productos")
/**
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 08/11/2024
 */
public class ProductoController {
	@Autowired
	IProducto service;

	@Operation(summary = "Listar productos", description = "Ver todos los productos de la BD", responses = {
			@ApiResponse(responseCode = "201", description = "Muestra productos con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> listarProductos() {
		return service.listarProductos();
	}

	@Operation(summary = "Insertar productos", description = "Insertar productos por parametros en el body", responses = {
			@ApiResponse(responseCode = "201", description = "Ingreso de producto con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el producto ya existe") })
	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Producto> altaProducto(@RequestBody Producto producto) {
		return service.altaProducto(producto);
	}

	@Operation(summary = "Modificar productos", description = "Modificar productos por parametros en el body", responses = {
			@ApiResponse(responseCode = "201", description = "Modificación de producto con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida") })
	@PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public void modificarProducto(@RequestBody Producto producto) {
		service.modificarProducto(producto);
	}

	@Operation(summary = "Eliminar Producto", description = "Eliminar producto por su ID", responses = {
			@ApiResponse(responseCode = "201", description = "Eliminación de producto con exito"),
			@ApiResponse(responseCode = "400", description = "Solicitud inválida"),
			@ApiResponse(responseCode = "409", description = "Conflicto: el producto no existe") })
	@DeleteMapping(value = "{idProducto}")
	public void eliminarProducto(@PathVariable int idProducto) {
		service.eliminarProducto(idProducto);
	}

	@GetMapping(value = "precio/{idProducto}", produces = MediaType.APPLICATION_JSON_VALUE)
	public double precioProducto(@PathVariable int idProducto) {
		return service.precio(idProducto);
	}

	@PutMapping(value = "{idProducto}/{unidades}")
	public void actualizarStock(@PathVariable int idProducto, @PathVariable int unidades) {
		service.actualizarStock(idProducto, unidades);
	}
}
