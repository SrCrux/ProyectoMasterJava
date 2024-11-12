package com.masterjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterjava.model.Pedido;

/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
