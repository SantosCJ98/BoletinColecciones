package Ej1;

import java.util.ArrayList;

import clases.Caja;

import static teclado.Teclado.*;

public class Apartado2 {

	// Funcion que rellena la caja

	public static ArrayList<Caja<Long>> rellenar_long() {

		ArrayList<Caja<Long>> lista = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
			lista.add(new Caja<Long>(Long.valueOf(i+1)));	
			
		}
			
		
			
		
		
		return lista;
		
	}

	

	public static void main(String[] args) {
		
		ArrayList<Caja<Long>> lista = rellenar_long();
		
		long res = 0;
			
			for (int i = 0; i < lista.size(); i++) {
				
				System.out.println("Caja " + (i+1) + ": " +lista.get(i).getObjeto());
				
				res += lista.get(i).getObjeto();
				
			}
				
				
			System.out.println("Resultado de la suma: " + res);
				
			}
			
			
			
		}

	
