package ejerc1TP7b;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carpeta extends ElementoFS{
	
	private ArrayList<ElementoFS> lista;
	
	public Carpeta(String nombre, double tamanio, LocalDate fechaCreacion) {
		super(nombre, tamanio, fechaCreacion);
		lista = new ArrayList<ElementoFS>();
	}

	public void addElemento(ElementoFS elem) {
		if(!lista.contains(elem)) {
			lista.add(elem);
		}
	}
	@Override
	public boolean equals(Object o) {
		try {
			Carpeta otro = (Carpeta)o;
			return this.getNombre().equals(otro.getNombre());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public double getTamanio() {
		double suma = 0;
		for(ElementoFS elem: lista) {
			suma+= elem.getTamanio();
		}
		return suma;
	}

	@Override
	public int cantElementos() {
		int cant = 0;
		for(ElementoFS elem: lista) {
			cant+= elem.cantElementos();
		}
		return cant;
	}

}
