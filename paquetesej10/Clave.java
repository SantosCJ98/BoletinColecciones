package paquetesej10;

public class Clave implements Comparable<Clave> {

	Clave(Categoria categoria, int numero) {

		this.categoria = categoria;

		this.numero = Integer.valueOf(numero);

	}

	private Categoria categoria;

	private int numero;

	private Categoria getCategoria() {
		return categoria;
	}

	private int getNumero() {
		return numero;
	}

	public String toString() {

		return String.format("%c%d", getCategoria().getCodigo(), (int) getNumero());

	}

	@Override
	public int compareTo(Clave clave) {
		
		int resultado = getCategoria().compareTo(clave.getCategoria());
		
		if (resultado != 0) {
			
			return resultado;
			
		}
		
		return Integer.compare(getNumero(), clave.getNumero());

	}

}
