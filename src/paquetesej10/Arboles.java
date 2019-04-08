package paquetesej10;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

import static teclado.Teclado.*;

public class Arboles {

	public static void menu() {

		int opcion = 0;

		Empleado e1 = new Empleado("Pepe", Categoria.EMPLEADO, LocalDate.of(2011, Month.MAY, 21),
				LocalDate.of(2013, Month.APRIL, 22));

		Empleado e2 = new Empleado("Juan", Categoria.ENCARGADO, LocalDate.of(2012, Month.FEBRUARY, 29), null);

		Empleado e3 = new Empleado("Maria", Categoria.JEFE, LocalDate.of(2010, Month.APRIL, 30),
				LocalDate.of(2014, Month.MAY, 31));

		Empleado e4 = new Empleado("Laura", Categoria.EMPLEADO, LocalDate.of(2010, Month.DECEMBER, 30), null);

		Empleado e5 = new Empleado("Esteban", Categoria.ENCARGADO, LocalDate.of(2010, Month.NOVEMBER, 5),
				LocalDate.of(2015, Month.FEBRUARY, 11));

		Empleado e6 = new Empleado("Pedro", Categoria.JEFE, LocalDate.of(2009, Month.AUGUST, 16), null);

		Empleado e7 = new Empleado("Yolanda", Categoria.EMPLEADO, LocalDate.of(2012, Month.JULY, 27),
				LocalDate.of(2013, Month.OCTOBER, 1));

		Empleado e8 = new Empleado("Nuria", Categoria.JEFE, LocalDate.of(2009, Month.AUGUST, 31), null);

		Empleado e9 = new Empleado("Antonio", Categoria.ENCARGADO, LocalDate.of(2011, Month.JANUARY, 28),
				LocalDate.of(2014, Month.MAY, 14));

		System.out.println("1. Ordenar por días trabajados\n2. Orden alfabético ascendente\n3. Ordenar por clave");

		opcion = readRange(1, 3, Rangos.AMBOSIN);

		switch (opcion) {

		case 1:

			TreeSet<Empleado> plantilla = new TreeSet<>();

			plantilla.add(e1);

			plantilla.add(e2);

			plantilla.add(e3);

			plantilla.add(e4);

			plantilla.add(e5);

			plantilla.add(e6);

			plantilla.add(e7);

			plantilla.add(e8);

			plantilla.add(e9);

			plantilla.add(e1);

			plantilla.add(e5);

			plantilla.add(e6);

			for (Empleado empleado : plantilla) {

				System.out.println(empleado.toString());

			}

			break;

		case 2:

			TreeSet<Empleado> plantilla2 = new TreeSet<>();

			plantilla2.add(e1);

			plantilla2.add(e2);

			plantilla2.add(e3);

			plantilla2.add(e4);

			plantilla2.add(e5);

			plantilla2.add(e6);

			plantilla2.add(e7);

			plantilla2.add(e8);

			plantilla2.add(e9);

			plantilla2.add(e1);

			plantilla2.add(e5);

			plantilla2.add(e6);

			List<Empleado> plantilla3 = new ArrayList<>(plantilla2);

			Collections.sort(plantilla3, new Comparator<Empleado>() {

				@Override
				public int compare(Empleado emp1, Empleado emp2) {

					return emp1.getNombre().compareTo(emp2.getNombre());

				}

			});

			for (Empleado empleado : plantilla3) {

				System.out.println(empleado.toString());

			}

			break;

		case 3:

			Set<Empleado> plantilla4 = new HashSet<>();

			plantilla4.add(e1);

			plantilla4.add(e2);

			plantilla4.add(e3);

			plantilla4.add(e4);

			plantilla4.add(e5);

			plantilla4.add(e6);

			plantilla4.add(e7);

			plantilla4.add(e8);

			plantilla4.add(e9);

			plantilla4.add(e1);

			plantilla4.add(e5);

			plantilla4.add(e6);

			Map<Clave, String> plantilla5 = new TreeMap<>(plantilla4.stream().collect(Collectors.toMap(c -> c.getClave(), v -> v.toString())));
			
			for (Map.Entry<Clave, String> plantillaforeach : plantilla5.entrySet()) {
				
				System.out.println(plantillaforeach.getValue());
				
			}
			
		}

	}

	public static void main(String[] args) {

		menu();

	}

}
