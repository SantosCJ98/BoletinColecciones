package paquetesej8;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Map.Entry;

import teclado.Teclado.Rangos;
import static teclado.Teclado.*;

public class Videoclub {

	public static void menu() {

		int opcion = 0;

		Pelicula p1 = new Pelicula("Poltergeist, juegos diabolicos", Genero.TERROR, LocalDate.of(2015, Month.MAY, 22),
				LocalDate.of(2015, Month.SEPTEMBER, 22));

		Pelicula p2 = new Pelicula("La cumbre escarlata", Genero.TERROR, LocalDate.of(2015, Month.OCTOBER, 9),
				LocalDate.of(2016, Month.FEBRUARY, 12));

		Pelicula p3 = new Pelicula("Ocho apellidos catalanes", Genero.COMEDIA, LocalDate.of(2015, Month.NOVEMBER, 20),
				LocalDate.of(2016, Month.MARCH, 18));

		Pelicula p4 = new Pelicula("Padres por desigual", Genero.COMEDIA, LocalDate.of(2016, Month.JANUARY, 1),
				LocalDate.of(2016, Month.MAY, 10));

		Pelicula p5 = new Pelicula("Star Wars: El despertar de la Fuerza", Genero.FICCION,
				LocalDate.of(2015, Month.DECEMBER, 18), LocalDate.of(2016, Month.APRIL, 19));

		Pelicula p6 = new Pelicula("Mad Max: Furia en la Carretera", Genero.FICCION, LocalDate.of(2015, Month.MAY, 15),
				LocalDate.of(2015, Month.SEPTEMBER, 1));

		Pelicula p7 = new Pelicula(p1);

		Pelicula p8 = new Pelicula(p5);
		
		Set<Pelicula> videoclub;
		
		Map<Clave, String> videoclub2;
		
		Iterator<String> it;

		do {
		
		System.out.println(
				"1. Orden de inserción sin duplicados\n2. Número de días desde que se estrenó la película hasta que salió el DVD\n3. Fecha de estreno\n4. Ordenado por clave\n5. Ordenado por clave (Inverso)\n6. Salir");

		opcion = readRange(1, 6, Rangos.AMBOSIN);

		switch (opcion) {

		case 1:

			videoclub = new LinkedHashSet<>();

			videoclub.add(p1);

			videoclub.add(p2);

			videoclub.add(p3);

			videoclub.add(p4);

			videoclub.add(p5);

			videoclub.add(p6);

			videoclub.add(p7);

			videoclub.add(p8);

			for (Pelicula pelicula : videoclub) {

				System.out.println(pelicula.toString());

			}

			break;

		case 2:

			videoclub = new TreeSet<>();

			videoclub.add(p1);

			videoclub.add(p2);

			videoclub.add(p3);

			videoclub.add(p4);

			videoclub.add(p5);

			videoclub.add(p6);

			videoclub.add(p7);

			videoclub.add(p8);

			for (Pelicula pelicula : videoclub) {

				System.out.printf("%-40s%-40s\n", pelicula.toString(), "Días: " + pelicula.numdias());

			}

			break;

		case 3:

			videoclub = new TreeSet<>((peli1, peli2) -> {

				return peli1.getFechaestreno().compareTo(peli2.getFechaestreno());

			});

			videoclub.add(p1);

			videoclub.add(p2);

			videoclub.add(p3);

			videoclub.add(p4);

			videoclub.add(p5);

			videoclub.add(p6);

			videoclub.add(p7);

			videoclub.add(p8);

			for (Pelicula pelicula : videoclub) {

				System.out.println(pelicula.toString());

			}

			break;

		case 4:

			videoclub2 = new TreeMap<>();

			videoclub2.put(p1.getClave(), p1.toString());

			videoclub2.put(p2.getClave(), p2.toString());

			videoclub2.put(p3.getClave(), p3.toString());

			videoclub2.put(p4.getClave(), p4.toString());

			videoclub2.put(p5.getClave(), p5.toString());

			videoclub2.put(p6.getClave(), p6.toString());

			videoclub2.put(p7.getClave(), p7.toString());

			videoclub2.put(p8.getClave(), p8.toString());

			for (Map.Entry<Clave, String> pelicula : videoclub2.entrySet()) {

				System.out.println(pelicula.getValue());

			}

			break;

		case 5:

			videoclub2 = new TreeMap<>(Collections.reverseOrder());

			videoclub2.put(p1.getClave(), p1.toString());

			videoclub2.put(p2.getClave(), p2.toString());

			videoclub2.put(p3.getClave(), p3.toString());

			videoclub2.put(p4.getClave(), p4.toString());

			videoclub2.put(p5.getClave(), p5.toString());

			videoclub2.put(p6.getClave(), p6.toString());

			videoclub2.put(p7.getClave(), p7.toString());

			videoclub2.put(p8.getClave(), p8.toString());

			it = videoclub2.values().iterator();
			
			while (it.hasNext()) {
				
				System.out.println(it.next());
				
			}
			
			break;

		}
		
		} while (opcion != 6);

	}

	public static void main(String args[]) {

		menu();

	}

}
