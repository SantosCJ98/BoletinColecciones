package paquetesej8;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.Map.Entry;

import teclado.Teclado.Rangos;
import static teclado.Teclado.*;

public class Videoclub {

	public static void menu() {

		Comparator<Pelicula> ordenarporfecha = Comparator.comparing(pelicula -> pelicula.getFechaestreno());

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

		Map<Clave, Pelicula> videoclub2;

		List<Pelicula> lista;

		ListIterator<Pelicula> it;

		do {

			System.out.println(
					"1. Orden de inserción sin duplicados\n2. Número de días desde que se estrenó la película hasta que salió el DVD\n3. Fecha de estreno\n4. Ordenado por clave\n5. Ordenado por clave (Inverso)\n6. Salir");

			opcion = readRange(1, 6, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:

				videoclub = new LinkedHashSet<>(List.of(p1, p2, p3, p4, p5, p6, p7, p8));

				for (Pelicula pelicula : videoclub) {

					System.out.println(pelicula.toString());

				}

				break;

			case 2:

				videoclub = new TreeSet<>(List.of(p1, p2, p3, p4, p5, p6, p7, p8));

				for (Pelicula pelicula : videoclub) {

					System.out.printf("%-40s%-40s\n", pelicula.toString(), "Días: " + pelicula.numdias());

				}

				break;

			case 3:

				videoclub = new TreeSet<>(ordenarporfecha);

				videoclub.addAll(List.of(p1, p2, p3, p4, p5, p6, p7, p8));

				for (Pelicula pelicula : videoclub) {

					System.out.println(pelicula.toString());

				}

				break;

			case 4:

				videoclub2 = new TreeMap<>();

				videoclub2.putAll(Map.of(p1.getClave(), p1, p2.getClave(), p2, p3.getClave(), p3, p4.getClave(), p4,
						p5.getClave(), p5, p6.getClave(), p6));

				videoclub2.put(p7.getClave(), p7);

				videoclub2.put(p8.getClave(), p8);

				for (Map.Entry<Clave, Pelicula> pelicula : videoclub2.entrySet()) {

					System.out.println(pelicula.getValue().toString());

				}

				break;

			case 5:

				videoclub2 = new TreeMap<>();

				videoclub2.putAll(Map.of(p1.getClave(), p1, p2.getClave(), p2, p3.getClave(), p3, p4.getClave(), p4,
						p5.getClave(), p5, p6.getClave(), p6));

				videoclub2.put(p7.getClave(), p7);

				videoclub2.put(p8.getClave(), p8);

				lista = new ArrayList<>(videoclub2.values());

				it = lista.listIterator(lista.size());

				while (it.hasPrevious()) {

					System.out.println(it.previous().toString());

				}

				break;

			}

		} while (opcion != 6);

	}

	public static void main(String args[]) {

		menu();

	}

}
