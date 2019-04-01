package paquetesej8;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

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

		while (opcion != 6) {

			System.out.println(
					"1. Orden de inserción sin duplicados\n2. Número de días desde que se estrenó la película hasta que salió el DVD\n3. Fecha de estreno\n4. Ordenado por clave\n5. Ordenado por clave (Inverso)\n6. Salir");

			opcion = readRange(1, 6, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:

				Set<Pelicula> videoclub = new LinkedHashSet<>();

				videoclub.add(p1);

				videoclub.add(p2);

				videoclub.add(p3);

				videoclub.add(p4);

				videoclub.add(p5);

				videoclub.add(p6);

				videoclub.add(p1);

				videoclub.add(p5);

				for (Pelicula pelicula : videoclub) {

					System.out.println(pelicula.toString());

				}

				break;

			case 2:

				Set<Pelicula> videoclub2 = new HashSet<>();

				videoclub2.add(p1);

				videoclub2.add(p2);

				videoclub2.add(p3);

				videoclub2.add(p4);

				videoclub2.add(p5);

				videoclub2.add(p6);

				videoclub2.add(p1);

				videoclub2.add(p5);

				List<Pelicula> videoclub3 = new ArrayList<>(videoclub2);

				Collections.sort(videoclub3, Collections.reverseOrder(new Comparator<Pelicula>() {

					@Override
					public int compare(Pelicula peli1, Pelicula peli2) {
						if (peli1.numdias() > peli2.numdias()) {

							return 1;

						}

						else if (peli1.numdias() < peli2.numdias()) {

							return -1;
						}

						else {
							return peli2.getNombre().compareToIgnoreCase(peli1.getNombre());
						}

					}

				}));

				for (Pelicula pelicula : videoclub3) {

					System.out.printf("%-40s%-40s\n", pelicula.toString(), "Días: " + pelicula.numdias());

				}

				break;

			case 3:

				Set<Pelicula> videoclub4 = new HashSet<>();

				videoclub4.add(p1);

				videoclub4.add(p2);

				videoclub4.add(p3);

				videoclub4.add(p4);

				videoclub4.add(p5);

				videoclub4.add(p6);

				videoclub4.add(p1);

				videoclub4.add(p5);

				List<Pelicula> videoclub5 = new ArrayList<>(videoclub4);

//					// Clase anónima
//			
//					Collections.sort(videoclub5, new Comparator<Pelicula>() {
//						
//			
//						@Override
//						public int compare(Pelicula peli1, Pelicula peli2) {
//							
//							if (peli1.getFechaestreno().isBefore(peli2.getFechaestreno())) {
//								
//								return -1;
//								
//							}
//							
//							else if (peli1.getFechaestreno().isAfter(peli2.getFechaestreno())) {
//								
//								return 1;
//								
//							}
//							
//							else {
//								
//								return 0;
//								
//							}
//							
//							
//						}
//						
//						
//						
//					});

				// Lambda
				videoclub5.sort((peli1, peli2) -> {

					if (peli1.getFechaestreno().isBefore(peli2.getFechaestreno())) {

						return -1;

					}

					else if (peli1.getFechaestreno().isAfter(peli2.getFechaestreno())) {

						return 1;

					}

					else {

						return 0;

					}

				});

				for (Pelicula pelicula : videoclub5) {

					System.out.println(pelicula.toString());

				}

				break;

			case 4:

				Set<Pelicula> videoclub6 = new HashSet<>();

				videoclub6.add(p1);

				videoclub6.add(p2);

				videoclub6.add(p3);

				videoclub6.add(p4);

				videoclub6.add(p5);

				videoclub6.add(p6);

				videoclub6.add(p1);

				videoclub6.add(p5);

				List<Pelicula> videoclub7 = new ArrayList<>(videoclub6);

				Collections.sort(videoclub7, new Comparator<Pelicula>() {

					@Override
					public int compare(Pelicula peli1, Pelicula peli2) {

						if (peli1.getClave().getGenero().getCodigo() == 'F'
								&& peli2.getClave().getGenero().getCodigo() == 'T') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'F'
								&& peli2.getClave().getGenero().getCodigo() == 'C') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'T'
								&& peli2.getClave().getGenero().getCodigo() == 'C') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'T'
								&& peli2.getClave().getGenero().getCodigo() == 'F') {

							return 1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'C'
								&& peli2.getClave().getGenero().getCodigo() == 'F') {

							return 1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'C'
								&& peli2.getClave().getGenero().getCodigo() == 'T') {

							return 1;

						}

						else {

							return peli1.getClave().getNumero().compareTo(peli2.getClave().getNumero());

						}

					}

				});

				for (Pelicula pelicula : videoclub7) {

					System.out.println(pelicula.toString());

				}

				break;

			case 5:

				Set<Pelicula> videoclub8 = new HashSet<>();

				videoclub8.add(p1);

				videoclub8.add(p2);

				videoclub8.add(p3);

				videoclub8.add(p4);

				videoclub8.add(p5);

				videoclub8.add(p6);

				videoclub8.add(p1);

				videoclub8.add(p5);

				List<Pelicula> videoclub9 = new ArrayList<>(videoclub8);

				Collections.sort(videoclub9, Collections.reverseOrder(new Comparator<Pelicula>() {

					@Override
					public int compare(Pelicula peli1, Pelicula peli2) {

						if (peli1.getClave().getGenero().getCodigo() == 'F'
								&& peli2.getClave().getGenero().getCodigo() == 'T') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'F'
								&& peli2.getClave().getGenero().getCodigo() == 'C') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'T'
								&& peli2.getClave().getGenero().getCodigo() == 'C') {

							return -1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'T'
								&& peli2.getClave().getGenero().getCodigo() == 'F') {

							return 1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'C'
								&& peli2.getClave().getGenero().getCodigo() == 'F') {

							return 1;

						}

						else if (peli1.getClave().getGenero().getCodigo() == 'C'
								&& peli2.getClave().getGenero().getCodigo() == 'T') {

							return 1;

						}

						else {

							return peli1.getClave().getNumero().compareTo(peli2.getClave().getNumero());

						}

					}

				}));

				ListIterator<Pelicula> videoclub10 = videoclub9.listIterator();

				while (videoclub10.hasNext()) {

					System.out.println(videoclub10.next().toString());

				}

				break;

			}

		}

	}

	public static void main(String args[]) {

		menu();

	}

}
