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

	@Override
	public int compareTo(Clave clave) {
		if (this.getCategoria().getCodigo() == 'J' && clave.getCategoria().getCodigo() == 'D') {

			return -1;

		}

		else if (this.getCategoria().getCodigo() == 'J' && clave.getCategoria().getCodigo() == 'E') {

			return -1;

		}

		else if (this.getCategoria().getCodigo() == 'E' && clave.getCategoria().getCodigo() == 'D') {

			return -1;

		}

		else if (this.getCategoria().getCodigo() == 'E' && clave.getCategoria().getCodigo() == 'J') {

			return 1;

		}

		else if (this.getCategoria().getCodigo() == 'D' && clave.getCategoria().getCodigo() == 'J') {

			return 1;

		}

		else if (this.getCategoria().getCodigo() == 'D' && clave.getCategoria().getCodigo() == 'E') {

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
