package com.masterjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masterjava.model.Producto;

/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
