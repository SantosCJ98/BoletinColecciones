package Ej4;

import teclado.Teclado.Rangos;

import static teclado.Teclado.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Menu {

	public static void main(String args[]) {

		menu();

	}

	public static void menu() {

		Collection<Float> lista = new ArrayList<>();

		lista.add(2.5f);

		lista.add(6.4f);

		lista.add(10.27f);

		Iterator<Float> itera = lista.iterator();

		int opcion = 0;

		boolean mostrado = false;

		while (opcion != 4) {

			System.out.println("1. Mostrar la lista\n2. Mostrar siguiente\n3. Eliminar ultimo mostrado\n4. Salir");

			opcion = readRange(1, 5, Rangos.AMBOSIN);

			if (opcion != 4 && lista.isEmpty()) {

				System.out.println("No hay elementos en la lista");

			}

			else {

				switch (opcion) {

				case 1:

					for (Float decimal : lista) {

						System.out.println(decimal);

					}

					break;

				case 2:

					if (itera.hasNext()) {

						System.out.println(itera.next());

					}

					else {

						itera = lista.iterator();

						System.out.println(itera.next());

					}

					mostrado = true;

					break;

				case 3:

					if (mostrado) {

						itera.remove();

						mostrado = false;

					}

					break;

				}

			}

		}

	}

}
