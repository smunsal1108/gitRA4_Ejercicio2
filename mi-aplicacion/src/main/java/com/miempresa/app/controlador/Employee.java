package com.miempresa.app.controlador;

public class Employee {

	String nombre;
	int añosEmpresa;
	
	public Employee(String nombre, int añosEmpresa) {
		this.nombre = nombre;
		this.añosEmpresa = añosEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAñosEmpresa() {
		return añosEmpresa;
	}

	public void setAñosEmpresa(int añosEmpresa) {
		this.añosEmpresa = añosEmpresa;
	}
	
	@Override
	public String toString() {
		return "Empleado: " + this.nombre + " Años en la empresa: " + this.añosEmpresa;
	}
	
}
