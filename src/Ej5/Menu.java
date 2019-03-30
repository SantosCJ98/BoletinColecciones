package Ej5;

import teclado.Teclado.Rangos;

import static teclado.Teclado.*;

import java.util.ArrayList;

public class Menu {

	public static void main(String args[]) {

		menu();

	}

	public static void menu() {

		boolean primerelemento = true;

		ArrayList<Float> lista = new ArrayList<>();

		lista.add(2.5f);

		lista.add(6.4f);

		lista.add(10.27f);

		int opcion = 0;

		int indice = 0;

		while (opcion != 5) {

			System.out.println(
					"1. Mostrar la lista\n2. Mostrar siguiente\n3. Mostrar anterior\n4. Eliminar ultimo mostrado\n5. Salir");

			opcion = readRange(1, 5, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:
				for (int i = 0; i < lista.size(); i++) {

					System.out.println(lista.get(i));

				}

				break;

			case 2:

				if (lista.size() >= 1) {

					if (primerelemento) {

						System.out.println(lista.get(indice));

						primerelemento = false;

					}

					else {

						if (indice == lista.size() - 1) {

							indice = 0;

						}

						else {

							indice++;

						}

						System.out.println(lista.get(indice));

					}

				}

				break;

			case 3:

				if (lista.size() >= 1) {

					if (primerelemento) {

						System.out.println(lista.get(indice));

						primerelemento = false;

					}

					else {

						if (indice == lista.size() - 1) {

							indice--;

						}

						else if (indice == 0) {

							indice = lista.size() - 1;

						}

						else {

							indice--;

						}

						System.out.println(lista.get(indice));

					}

				}

				break;

			case 4:

				if (lista.size() >= 1) {

					lista.remove(indice);

					indice /= 2;

				}

			}

		}

	}

}
