package Ejercicio1;

import java.time.LocalDate;


public class Link extends ElementoFS {

	private ElementoFS apuntado;
	public static final String INICIO = "LINK.";
	public static final double TAMANIOLINK = 1;


	public Link(String nombre, double tamanio, LocalDate fechaCreacion, ElementoFS apuntado) {
		super(INICIO + apuntado.getNombre(), tamanio, fechaCreacion);
		this.apuntado = apuntado;
	}
	public String getNombre(String nombre) {
		return INICIO + apuntado.getNombre();
	}

	public ElementoFS getApuntado() {
		return apuntado;
	}


	public void setApuntado(ElementoFS apuntado) {
		this.apuntado = apuntado;
	}


	@Override
	public double getTamanio() {
		return TAMANIOLINK;
	}

}
