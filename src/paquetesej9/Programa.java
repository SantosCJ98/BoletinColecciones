package paquetesej9;

import java.time.*;
import java.util.*;

import static teclado.Teclado.*;

import teclado.Teclado.Rangos;

public class Programa {

	public static void menu() {

		int opcion = 0;

		int limiteinferior;

		int limitesuperior;

		List<Examen> lista;

		Set<Examen> set;

		Map<Clave, Examen> mapa;

		ListIterator<Examen> it;

		List<Examen> rango;

		Examen ex1 = new Examen("Programacion", "Herencia y Colecciones", LocalDate.of(2017, Month.JUNE, 16),
				LocalTime.of(8, 15), LocalTime.of(13, 30));

		Examen ex2 = new Examen("Base de datos", "Disparadores y SQL", LocalDate.of(2017, Month.JUNE, 15),
				LocalTime.of(11, 45), LocalTime.of(14, 30));

		Examen ex3 = new Examen("Sistemas Informáticos", "Sistemas en red", LocalDate.of(2017, Month.JUNE, 20),
				LocalTime.of(10, 15), LocalTime.of(11, 45));

		Examen ex4 = new Examen("Entornos de Desarrollo", "Diagrama de clases", LocalDate.of(2017, Month.JUNE, 19),
				LocalTime.of(9, 15), LocalTime.of(11, 15));

		Examen ex5 = new Examen("Lenguaje de Marcas", "Hojas de estilo", LocalDate.of(2017, Month.JUNE, 14),
				LocalTime.of(8, 15), LocalTime.of(11, 15));

		Examen ex6 = new Examen("FOL", "Derechos del trabajador", LocalDate.of(2017, Month.JUNE, 13),
				LocalTime.of(10, 15), LocalTime.of(11, 15));

		Examen ex7 = new Examen("Base de datos", "Entidad-Relacion", LocalDate.of(2017, Month.JUNE, 15),
				LocalTime.of(8, 15), LocalTime.of(11, 30));

		Examen ex8 = new Examen(ex1);

		Examen ex9 = new Examen(ex5);

		while (opcion != 9) {

			System.out.println(
					"1. ArrayList\n2. Sin duplicados por orden de inserción\n3. Segunda opcion en orden inverso con iteradores\n4. Sin duplicados entre un rango\n5. Árbol ordenado por asignatura, fecha, y hora con Comparable\n6. Árbol ordenado por fecha, y hora con Comparator\n7. Mapa\n8. Ordenado por clave\n9. Salir");

			opcion = readRange(1, 9, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:

				lista = new ArrayList<>(List.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9));

				for (Examen examen : lista) {

					System.out.println(examen.toString());

				}

				break;

			case 2:

				set = new LinkedHashSet<>(List.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9));

				for (Examen examen : set) {

					System.out.println(examen.toString());

				}

				break;

			case 3:

				set = new LinkedHashSet<>(List.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9));

				it = new ArrayList<>(set).listIterator(set.size());

				while (it.hasPrevious()) {

					System.out.println(it.previous().toString());

				}

				break;

			case 4:

				set = new LinkedHashSet<>(List.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9));

				rango = new ArrayList<>(set);

				System.out.println("Introduce el limite superior");

				limitesuperior = readRange(1, rango.size(), Rangos.AMBOSIN);

				System.out.println("Introduce el limite inferior");

				limiteinferior = readRange(1, limitesuperior, Rangos.AMBOSIN);

				for (int i = limiteinferior - 1; i < limitesuperior; i++) {

					System.out.println(rango.get(i).toString());

				}

				break;

			case 5:

				set = new TreeSet<>(List.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9));

				for (Examen examen : set) {

					System.out.println(examen.toString());

				}

				break;

			case 6:

				// Lambda

				set = new TreeSet<>((exa1, exa2) -> {

					int resultado = exa2.getFecha().compareTo(exa1.getFecha());

					if (resultado != 0) {

						return resultado;

					}

					return exa2.getHorainicio().compareTo(exa1.getHorainicio());

				});

				// Clase anónima
//				set = new TreeSet<>(new Comparator<Examen>() {
//
//					@Override
//					public int compare(Examen exa1, Examen exa2) {
//						int resultado = exa2.getFecha().compareTo(exa1.getFecha());
//
//						if (resultado != 0) {
//
//							return resultado;
//
//						}
//
//						return exa2.getHorainicio().compareTo(exa1.getHorainicio());
//					}
//					
//					
//					
//				});

				set = Set.of(ex1, ex2, ex3, ex4, ex5, ex6, ex7, ex8, ex9);

				for (Examen examen : set) {

					System.out.println(examen.toString());

				}

				break;

			case 7:

				mapa = new LinkedHashMap<>(Map.of(ex1.getClave(), ex1, ex2.getClave(), ex2, ex3.getClave(), ex3,
						ex4.getClave(), ex4, ex5.getClave(), ex5, ex6.getClave(), ex6, ex7.getClave(), ex7));

				mapa.put(ex8.getClave(), ex8);

				mapa.put(ex9.getClave(), ex9);

				for (Map.Entry<Clave, Examen> examen : mapa.entrySet()) {

					System.out.println(examen.getValue().toString());

				}

				break;

			case 8:

				mapa = new TreeMap<>(
						mapa = new LinkedHashMap<>(Map.of(ex1.getClave(), ex1, ex2.getClave(), ex2, ex3.getClave(), ex3,
								ex4.getClave(), ex4, ex5.getClave(), ex5, ex6.getClave(), ex6, ex7.getClave(), ex7)));

				mapa.put(ex8.getClave(), ex8);

				mapa.put(ex9.getClave(), ex9);

				for (Map.Entry<Clave, Examen> Examen : mapa.entrySet()) {

					System.out.println(Examen.getValue().toString());

				}

				break;

			}

		}

	}

	public static void main(String[] args) {

		menu();

	}

}
