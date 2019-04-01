package paquetesej10;

public class Clave {

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

}
