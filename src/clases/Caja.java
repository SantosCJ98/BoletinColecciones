package clases;

public class Caja<T> {
	
	public T objeto;
	
	public Caja(T objeto) {
		
		this.objeto = objeto;
		
	}
	
	
	
	
	
	void setObjeto(T objeto) {
		
		this.objeto = objeto;
		
	}
	
	 public T getObjeto() {
		
		return (T)objeto;
		
	}

}
