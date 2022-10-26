package ejerc1TP7b;

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

	@Override
	public boolean equals(Object o) {
		try {
			Link otro = (Link)o;
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
