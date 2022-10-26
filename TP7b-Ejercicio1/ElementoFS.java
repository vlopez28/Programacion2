package Ejercicio1;

import java.time.LocalDate;

public abstract class  ElementoFS {
	private String nombre;
	private double tamanio;
	private LocalDate fechaCreacion;
	
	public ElementoFS(String nombre, double tamanio, LocalDate fechaCreacion) {
		this.nombre = nombre;
		this.tamanio = tamanio;
		this.fechaCreacion = fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double getTamanio();

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	
	
	

}
