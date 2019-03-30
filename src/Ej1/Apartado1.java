package Ej1;

import clases.Caja;

import java.util.ArrayList;

import static teclado.Teclado.*;

public class Apartado1 {

	protected static ArrayList<Caja<String>> rellenar_string() {

		ArrayList<Caja<String>> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			lista.add(new Caja<String>("Hola" + (i+1)));
			
		}
		
	
		
		return lista;
		
	}

	

	public static void main (String[] args) {
		
		ArrayList<Caja<String>> lista = rellenar_string();
			
			for (int i = 0; i < lista.size(); i++) {
				
				System.out.println("Caja " + (i+1) + ": " +lista.get(i).getObjeto());
				
			}
			
		}

	}
