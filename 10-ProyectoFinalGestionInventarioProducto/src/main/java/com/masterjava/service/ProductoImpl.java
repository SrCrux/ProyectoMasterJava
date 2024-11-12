package com.masterjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masterjava.model.Producto;
import com.masterjava.repository.ProductoRepository;

@Service
/**
 * 
 * @author Pablo Guijarro Pérez
 * @version 1.0 08/11/2024
 */
public class ProductoImpl implements IProducto {

	@Autowired
	ProductoRepository repository;

	@Override
	public List<Producto> listarProductos() {
		return repository.findAll();
	}

	@Override
	public ResponseEntity<Producto> altaProducto(Producto producto) {
		List<Producto> listaProductos = repository.findAll();
		for (Producto p : listaProductos) {
			if (p.getNombre().equals(producto.getNombre())) {
				return ResponseEntity.status(HttpStatus.CONFLICT).build();
			}
		}
		return new ResponseEntity<Producto>(repository.save(producto), HttpStatus.OK);
	}

	@Override
	public void modificarProducto(Producto producto) {
		repository.save(producto);

	}

	@Override
	public void eliminarProducto(int idProducto) {
		repository.deleteById(idProducto);

	}

	@Override
	public double precio(int idProducto) {
		Producto producto = repository.findById(idProducto).orElse(null);
		return producto != null ? producto.getPrecio() : 0;
	}

	@Override
	public void actualizarStock(int idProducto, int unidades) {
		Producto producto = repository.findById(idProducto).orElse(null);
		if (producto != null) {
			producto.setStock(producto.getStock() + unidades);
		}
		repository.save(producto);

	}

}
