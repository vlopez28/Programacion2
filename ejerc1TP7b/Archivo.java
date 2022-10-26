package ejerc1TP7b;

import java.time.LocalDate;

public class Archivo extends ElementoFS{
	private LocalDate fechaModificacion;

	public Archivo(String nombre, double tamanio, LocalDate fechaCreacion, LocalDate fechaModificacion) {
		super(nombre, tamanio, fechaCreacion);
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public double getTamanio() {
		return this.getTamanio();
	}
	@Override
	public boolean equals(Object o) {
		try {
			Archivo otro = (Archivo)o;
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
