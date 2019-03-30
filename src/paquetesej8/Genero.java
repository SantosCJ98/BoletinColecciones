package paquetesej8;

public enum Genero {

	COMEDIA('C'), FICCION('F'), TERROR('T');

	Genero(char codigo) {

		this.codigo = codigo;

	}

	private char codigo;

	char getCodigo() {

		return codigo;

	}
}
