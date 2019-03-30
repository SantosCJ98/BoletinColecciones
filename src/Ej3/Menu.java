package Ej3;

import teclado.Teclado.Rangos;

import static teclado.Teclado.*;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	public static void main(String args[]) {

		menu();

	}

	public static void menu() {

		List<String> lista = new ArrayList<>();

		int opcion = 0;

		while (opcion != 7) {

			System.out.println(
					"1. Nueva lista\n2. Número de cadenas\n3. Añadir cadena\n4. Eliminar cadena\n5. Contiene cadena\n6. Mostrar lista entera\n7. Salir");

			opcion = readRange(1, 7, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:
				lista.clear();

				break;

			case 2:
				System.out.println(lista.size());

				break;

			case 3:

				System.out.println("Introduce la cadena: ");

				lista.add(readString());

				break;

			case 4:

				if (lista.size() >= 1) {

					lista.remove(lista.size() - 1);

				}

				break;

			case 5:
				System.out.println("Introduce la cadena a buscar:");

				String buscar = readString();

				if (lista.contains(buscar)) {

					System.out.println("Se ha encontrado en la posicion " + lista.indexOf(buscar));

				}

				else {

					System.out.println("No se ha encontrado");

				}

				break;

			case 6:
				for (int i = 0; i < lista.size(); i++) {

					System.out.println(lista.get(i));

				}

				break;

			}

		}

	}

}
