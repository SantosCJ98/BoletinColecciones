package paquetesej10;

public class Clave implements Comparable<Clave> {

	Clave(Categoria categoria, int numero) {

		this.categoria = categoria;

		this.numero = Integer.valueOf(numero);

	}

	private Categoria categoria;

	private Integer numero;

	private Categoria getCategoria() {
		return categoria;
	}

	Integer getNumero() {
		return numero;
	}

	public String toString() {

		return String.format("%c%d", categoria.getCodigo(), (int) getNumero());

	}
	
	public int compareTo(Clave clave) {

		if (this.toString().charAt(0) == 'J'
				&& clave.toString().charAt(0) == 'D') {

			return -1;

		}

		else if (this.toString().charAt(0) == 'J'
				&& clave.toString().charAt(0) == 'E') {

			return -1;

		}

		else if (this.toString().charAt(0) == 'E'
				&& clave.toString().charAt(0) == 'D') {

			return -1;

		}

		else if (this.toString().charAt(0) == 'E'
				&& clave.toString().charAt(0) == 'J') {

			return 1;

		}

		else if (this.toString().charAt(0) == 'D'
				&& clave.toString().charAt(0) == 'J') {

			return 1;

		}

		else if (this.toString().charAt(0) == 'D'
				&& clave.toString().charAt(0) == 'E') {

			return 1;

		}

		else {

			if (this.getNumero() < clave.getNumero()) {

				return -1;

			}

			else if (this.getNumero() > clave.getNumero()) {

				return 1;

			}

			else {

				return 0;

			}

		}

	}

}
