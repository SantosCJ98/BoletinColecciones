package paquetesej8;

public class Clave implements Comparable<Clave> {
	
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

	@Override
	public int compareTo(Clave clave) {
		
		if (getGenero().getCodigo() == 'F' && clave.getGenero().getCodigo() == 'T') {
			
			return -1;
			
		}
		
		else if (getGenero().getCodigo() == 'F' && clave.getGenero().getCodigo() == 'C') {
				
				return -1;
				
			}
		
		else if (getGenero().getCodigo() == 'T' && clave.getGenero().getCodigo() == 'C') {
			
			return -1;
			
		}
		
		else if (getGenero().getCodigo() == 'T' && clave.getGenero().getCodigo() == 'F') {
			
			return 1;
			
		}
		
		else if (getGenero().getCodigo() == 'C' && clave.getGenero().getCodigo() == 'F') {
			
			return 1;
			
		}
		
		else if (getGenero().getCodigo() == 'C' && clave.getGenero().getCodigo() == 'T') {
			
			return 1;
			
		}
		
		else {
			
			return getNumero().compareTo(clave.getNumero());
			
			
		}
		
	}
	


}
