package paquetesej8;

public enum Genero {

	FICCION('F'), TERROR('T'), COMEDIA('C');

	Genero(char codigo) {

		this.codigo = codigo;

	}

	private char codigo;

	char getCodigo() {

		return codigo;

	}
}
