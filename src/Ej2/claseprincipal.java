package Ej2;

import clases.Caja;

public class claseprincipal {

	public static void main(String[] args) {
	
		Almacen<String> almacen = new Almacen<String>();
		
		almacen.añadir_caja(new Caja<String>("Hola"));
		
		almacen.añadir_caja(new Caja<String>("Adios"));
		
		almacen.añadir_caja(new Caja<String>("¿Que hay de nuevo, viejo?"));
		
		
		
		
		System.out.println("Primera caja: " + almacen.primerContenido());
		
		System.out.println("Ultima caja: " + almacen.ultimoContenido());

	}

}
