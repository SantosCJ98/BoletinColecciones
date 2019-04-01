package Ej5;

import teclado.Teclado.Rangos;

import static teclado.Teclado.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class Menu {

	public static void main(String args[]) {

		menu();

	}

	public static void menu() {

		ArrayList<Float> lista = new ArrayList<>();

		lista.add(2.5f);

		lista.add(6.4f);

		lista.add(10.27f);

		ListIterator<Float> itera = lista.listIterator();

		int opcion = 0;

		boolean mostrado = false;

		while (opcion != 5) {

			System.out.println(
					"1. Mostrar la lista\n2. Mostrar siguiente\n3. Mostrar anterior\n4. Eliminar ultimo mostrado\n5. Salir");

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

						itera = lista.listIterator();

						System.out.println(itera.next());

					}

					mostrado = true;

					break;

				case 3:

					if (itera.hasPrevious()) {

						System.out.println(itera.previous());

					}

					else {

						itera = lista.listIterator(lista.size());

						System.out.println(itera.previous());

					}

					mostrado = true;

					break;

				case 4:

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
