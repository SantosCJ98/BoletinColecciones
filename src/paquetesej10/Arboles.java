package paquetesej10;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

import static teclado.Teclado.*;

public class Arboles {

	public static void menu() {
		
		Comparator<Empleado> pornombre = Comparator.comparing(empleado -> empleado.getNombre());

		int opcion = 0;

		Set<Empleado> arbol;
		
		List<Empleado> arbol2;

		Map<Clave, Empleado> mapa;

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

		Empleado e10 = new Empleado(e1);

		Empleado e11 = new Empleado(e5);

		Empleado e12 = new Empleado(e6);
		
		do {

		System.out.println("1. Ordenar por días trabajados\n2. Orden alfabético ascendente\n3. Ordenar por clave\n4. Salir");

		opcion = readRange(1, 4, Rangos.AMBOSIN);

		switch (opcion) {

		case 1:

			arbol = new TreeSet<>(List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));

			for (Empleado empleado : arbol) {

				System.out.println(empleado.toString());

			}

			break;

		case 2:

			arbol = new TreeSet<>(pornombre);
			
			arbol.addAll(List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12));

			for (Empleado empleado : arbol) {

				System.out.println(empleado.toString());

			}

			break;

		case 3:

			mapa = new TreeMap<>(Map.of(e1.getClave(), e1, e2.getClave(), e2, e3.getClave(), e3, e4.getClave(), e4,
					e5.getClave(), e5, e6.getClave(), e6, e7.getClave(), e7, e8.getClave(), e8, e9.getClave(), e9));

			mapa.put(e10.getClave(), e10);

			mapa.put(e11.getClave(), e11);

			mapa.put(e12.getClave(), e12);

			for (Map.Entry<Clave, Empleado> plantillaforeach : mapa.entrySet()) {

				System.out.println(plantillaforeach.getValue().toString());

			}

		}
		
		} while (opcion != 4);

	}

	public static void main(String[] args) {

		menu();

	}

}
