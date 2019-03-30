package Ej2;

import java.util.ArrayList;
import java.util.List;

import clases.Caja;

public class Almacen<T> implements Interfaz <T> {
	
	private List<Caja<T>> cajas;
	
	Almacen() {
		
		cajas = new ArrayList<>();
		
	}
	
	public void añadir_caja (Caja<T> caja) {
		
		cajas.add(caja);
		
	}

	@Override
	public T primerContenido() {
		
		return cajas.get(0).getObjeto();
		
	}

	@Override
	public T ultimoContenido() {

		return cajas.get(cajas.size()-1).getObjeto();
		
	}

}
