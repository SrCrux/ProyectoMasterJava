package com.masterjava.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresas")
/**
 * 
 * @author Pablo Guijarro Pérez
 *@version 1.0 08/11/2024
 */
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_Empresa")
	private int idEmpresa;

	private String nombre;
	private String correo;
	private int telefono;

	public Empresa() {
	}

	public Empresa(String nombre, String correo, int telefono) {
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Empresa(int idEmpresa, String nombre, String correo, int telefono) {
		this.idEmpresa = idEmpresa;
		this.nombre = nombre;
		this.correo = correo;
		this.telefono = telefono;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

}
