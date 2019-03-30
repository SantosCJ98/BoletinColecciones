package Ej6;

import teclado.Teclado.Rangos;

import static teclado.Teclado.*;

import java.util.ArrayList;

public class Menu {

	public static void main(String args[]) {

		menu();

	}

	public static void menu() {

		ArrayList<Byte> lista = new ArrayList<>();

		int opcion = 0;

		while (opcion != 6) {

			System.out.println(
					"1. Nueva pila\n2. Consultar elemento\n3. Añadir elemento\n4. Eliminar elemento\n5. Consultar toda la pila\n6. Salir");

			opcion = readRange(1, 6, Rangos.AMBOSIN);

			switch (opcion) {

			case 1:

				lista.clear();

				break;

			case 2:

				System.out.print("Buscar: ");

				byte buscar = readByte();

				if (lista.contains(buscar)) {

					System.out.println("\nSe ha encontrado en " + lista.indexOf(buscar));

				}

				else {

					System.out.println("\nNo se ha encontrado");

				}

				break;

			case 3:
				System.out.println("Introduce un número: ");

				lista.add(readByte());

				break;

			case 4:

				if (lista.size() >= 1) {

					lista.remove(lista.size() - 1);

				}

				break;

			case 5:

				for (int i = lista.size() - 1; i >= 0; i--) {

					System.out.println(lista.get(i));

				}

				break;

			}
		}

	}

}
