package com.masterjava.service;

import java.util.List;

import com.masterjava.model.Pedido;

/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public interface IPedido {
	
	void realizarPedido(Pedido pedido);
	
	List<Pedido> listarPedidosPorEmpresa(int idEmpresa);

}
