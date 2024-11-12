package com.masterjava.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Pedido")
	private int idPedido;
	@Column(name = "id_Empresa")
	private int idEmpresa;
	@Column(name = "id_Producto")
	private int idProducto;
	private int cantidad;
	private LocalDate fecha;
	private double total;

	public Pedido() {
	}

	public Pedido(int idEmpresa, int idProducto, int cantidad) {
		this.idEmpresa = idEmpresa;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
	}

	public Pedido(int idPedido, int idEmpresa, int idProducto, int cantidad, LocalDate fecha, double total) {
		this.idPedido = idPedido;
		this.idEmpresa = idEmpresa;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.total = total;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

}
