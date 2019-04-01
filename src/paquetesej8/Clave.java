package paquetesej8;

public class Clave {

	private Genero genero;

	private Integer numero;

	Clave(Genero genero, Integer numero) {

		this.genero = genero;

		this.numero = numero;

	}

	Integer getNumero() {

		return numero;

	}

	Genero getGenero() {

		return genero;

	}

	@Override
	public String toString() {
		return String.format("%c%d", genero.getCodigo(), getNumero());
	}

}
