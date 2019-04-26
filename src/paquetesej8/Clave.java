package paquetesej8;

public class Clave implements Comparable<Clave> {
	
	private Genero genero;
	
	private int numero;
	
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

	@Override
	public int compareTo(Clave clave) {
		
		int resultado = getGenero().compareTo(clave.getGenero());
		
		if (resultado != 0) {
			
			return resultado;
			
		}
		
		return (int)Integer.compare(getNumero(), clave.getNumero());
		
	}
	


}
