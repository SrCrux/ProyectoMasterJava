package com.masterjava.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.masterjava.model.EmpresaDTO;
import com.masterjava.model.Pedido;
import com.masterjava.repository.PedidoRepository;

@Service
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class PedidoImpl implements IPedido {

	@Autowired
	PedidoRepository repository;
	@Autowired
	RestTemplate template;

	private final String URL_EMPRESAS = "http://localhost:8080/empresas";
	private final String URL_PRODUCTOS = "http://localhost:8081/productos";

	@Override
	public List<Pedido> listarPedidosPorEmpresa(int idEmpresa) {
		List<Pedido> listaPedidos = repository.findAll();
		List<Pedido> listaPedidosEmpresa = new ArrayList<Pedido>();
		EmpresaDTO empresaID = template.getForObject(URL_EMPRESAS.concat("/{idEmpresa}"), EmpresaDTO.class, idEmpresa);
		for (Pedido pedido : listaPedidos) {
			if (pedido.getIdEmpresa() == empresaID.getIdEmpresa()) {
				listaPedidosEmpresa.add(pedido);
			}
		}
		return listaPedidosEmpresa;
	}

	@Override
	public void realizarPedido(Pedido pedido) {
		pedido.setFecha(LocalDate.now());
		pedido.setTotal(obtenerPrecioProducto(pedido.getIdProducto()) * pedido.getCantidad());
		repository.save(pedido);
		actualizarStock(pedido.getIdProducto(), pedido.getCantidad());

	}

	private double obtenerPrecioProducto(int idProducto) {
		return Double.parseDouble(
				template.getForObject(URL_PRODUCTOS.concat("/precio/{idProducto}"), String.class, idProducto));
	}

	private void actualizarStock(int idProducto, int unidades) {
		template.put(URL_PRODUCTOS.concat("/{idProducto}/{unidades}"), null, idProducto, unidades);
	}

}
