package ejerc1TP7b;

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
	public abstract int cantElementos();

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	
	@Override
	public boolean equals(Object o) {
		try {
			ElementoFS otro = (ElementoFS)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	

}
