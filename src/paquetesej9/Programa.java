package paquetesej9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

import static teclado.Teclado.*;

import teclado.Teclado.Rangos;

public class Programa {

	public static void menu() {

		int opcion = 0;

		int limiteinferior;

		int limitesuperior;

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

		while (opcion != 9) {

			System.out.println(
					"1. ArrayList\n2. Sin duplicados por orden de inserción\n3. Segunda opcion en orden inverso con iteradores\n4. Sin duplicados entre un rango\n5. Árbol ordenado por asignatura, fecha, y hora con Comparable\n6. Árbol ordenado por fecha, y hora con Comparator\n7. Mapa\n8. Ordenado por clave\n9. Salir");

			opcion = readRange(1, 9, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:

				List<Examen> examenes = new ArrayList<>();

				examenes.add(ex1);

				examenes.add(ex2);

				examenes.add(ex3);

				examenes.add(ex4);

				examenes.add(ex5);

				examenes.add(ex6);

				examenes.add(ex7);

				examenes.add(ex1);

				examenes.add(ex5);

				for (Examen examen : examenes) {

					System.out.println(examen.toString());

				}

				break;

			case 2:

				Set<Examen> examenes2 = new LinkedHashSet<>();

				examenes2.add(ex1);

				examenes2.add(ex2);

				examenes2.add(ex3);

				examenes2.add(ex4);

				examenes2.add(ex5);

				examenes2.add(ex6);

				examenes2.add(ex7);

				examenes2.add(ex1);

				examenes2.add(ex5);

				for (Examen examen : examenes2) {

					System.out.println(examen.toString());

				}

				break;

			case 3:

				Set<Examen> examenes3 = new LinkedHashSet<>();

				examenes3.add(ex1);

				examenes3.add(ex2);

				examenes3.add(ex3);

				examenes3.add(ex4);

				examenes3.add(ex5);

				examenes3.add(ex6);

				examenes3.add(ex7);

				examenes3.add(ex1);

				examenes3.add(ex5);

				ListIterator<Examen> examenes4 = new ArrayList<>(examenes3).listIterator(examenes3.size());

				while (examenes4.hasPrevious()) {

					System.out.println(examenes4.previous().toString());

				}

				break;

			case 4:

				Set<Examen> examenes5 = new LinkedHashSet<>();

				examenes5.add(ex1);

				examenes5.add(ex2);

				examenes5.add(ex3);

				examenes5.add(ex4);

				examenes5.add(ex5);

				examenes5.add(ex6);

				examenes5.add(ex7);

				examenes5.add(ex1);

				examenes5.add(ex5);

				List<Examen> examenes6 = new ArrayList<>(examenes5);

				System.out.println("Introduce el limite superior");

				limitesuperior = readRange(1, examenes6.size(), Rangos.AMBOSIN);

				System.out.println("Introduce el limite inferior");

				limiteinferior = readRange(1, limitesuperior, Rangos.AMBOSIN);

				for (int i = limiteinferior - 1; i < limitesuperior; i++) {

					System.out.println(examenes6.get(i).toString());

				}

				break;

			case 5:

				Set<Examen> examenes7 = new TreeSet<>();

				examenes7.add(ex1);

				examenes7.add(ex2);

				examenes7.add(ex3);

				examenes7.add(ex4);

				examenes7.add(ex5);

				examenes7.add(ex6);

				examenes7.add(ex7);

				examenes7.add(ex1);

				examenes7.add(ex5);

				for (Examen examen : examenes7) {

					System.out.println(examen.toString());

				}

				break;

			case 6:

				Set<Examen> examenes8 = new TreeSet<>();

				examenes8.add(ex1);

				examenes8.add(ex2);

				examenes8.add(ex3);

				examenes8.add(ex4);

				examenes8.add(ex5);

				examenes8.add(ex6);

				examenes8.add(ex7);

				examenes8.add(ex1);

				examenes8.add(ex5);

				List<Examen> examenes9 = new ArrayList<>(examenes8);

				// Clase anónima
//					
//					Collections.sort(examenes9, new Comparator<Examen>() {
//			
//						@Override
//						public int compare(Examen examen1, Examen examen2) {
//							
//							
//							LocalDateTime tiempo1 = LocalDateTime.of(examen1.getFecha().getYear(), examen1.getFecha().getMonth(), examen1.getFecha().getDayOfMonth(), examen1.getHorainicio().getHour(), examen1.getHorainicio().getMinute());
//							
//							LocalDateTime tiempo2 = LocalDateTime.of(examen2.getFecha().getYear(), examen2.getFecha().getMonth(), examen2.getFecha().getDayOfMonth(), examen2.getHorainicio().getHour(), examen2.getHorainicio().getMinute());
//							
//							return tiempo2.compareTo(tiempo1);
//							
//							
//							
//						}
//						
//						
//						
//					});

				// 7. Lambda

				examenes9.sort((examen1, examen2) -> {

					LocalDateTime tiempo1 = LocalDateTime.of(examen1.getFecha().getYear(),
							examen1.getFecha().getMonth(), examen1.getFecha().getDayOfMonth(),
							examen1.getHorainicio().getHour(), examen1.getHorainicio().getMinute());

					LocalDateTime tiempo2 = LocalDateTime.of(examen2.getFecha().getYear(),
							examen2.getFecha().getMonth(), examen2.getFecha().getDayOfMonth(),
							examen2.getHorainicio().getHour(), examen2.getHorainicio().getMinute());

					return tiempo2.compareTo(tiempo1);

				});

				for (Examen examen : examenes9) {

					System.out.println(examen.toString());

				}

				break;

			case 7:

				Map<String, Examen> examenes10 = new LinkedHashMap<>();

				examenes10.put(ex1.getClave().toString(), ex1);

				examenes10.put(ex2.getClave().toString(), ex2);

				examenes10.put(ex3.getClave().toString(), ex3);

				examenes10.put(ex4.getClave().toString(), ex4);

				examenes10.put(ex5.getClave().toString(), ex5);

				examenes10.put(ex6.getClave().toString(), ex6);

				examenes10.put(ex7.getClave().toString(), ex7);

				examenes10.put(ex1.getClave().toString(), ex1);

				examenes10.put(ex5.getClave().toString(), ex5);

				for (Map.Entry<String, Examen> Examen : examenes10.entrySet()) {

					System.out.println(Examen.getValue().toString());

				}

				break;

			case 8:

				Map<String, Examen> examenes11 = new HashMap<>();

				examenes11.put(ex1.getClave().toString(), ex1);

				examenes11.put(ex2.getClave().toString(), ex2);

				examenes11.put(ex3.getClave().toString(), ex3);

				examenes11.put(ex4.getClave().toString(), ex4);

				examenes11.put(ex5.getClave().toString(), ex5);

				examenes11.put(ex6.getClave().toString(), ex6);

				examenes11.put(ex7.getClave().toString(), ex7);

				examenes11.put(ex1.getClave().toString(), ex1);

				examenes11.put(ex5.getClave().toString(), ex5);

				TreeMap<String, Examen> ordenado = new TreeMap<>(examenes11);

				for (Map.Entry<String, Examen> Examen : ordenado.entrySet()) {

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
