package ejerc1TP7b;

import java.time.LocalDate;

public class Comprimido extends Carpeta{
	private double tasaComprension;

	public Comprimido(String nombre, double tamanio, LocalDate fechaCreacion, double tasaComprension) {
		super(nombre, tamanio, fechaCreacion);
		this.tasaComprension = tasaComprension;
	}

	public double getTasaComprension() {
		return tasaComprension;
	}

	public void setTasaComprension(double tasaComprension) {
		this.tasaComprension = tasaComprension;
	}
	@Override
	public boolean equals(Object o) {
		try {
			Comprimido otro = (Comprimido)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	
	@Override  
	public int cantElementos() {
		return 1;
	}
}