package paquetesej10;

public enum Categoria {
	
	JEFE('J'), ENCARGADO('E'), EMPLEADO('D');
	
	char codigo;
	
	Categoria(char codigo) {
		
		this.codigo = codigo;
		
	}
	
	char getCodigo() {
		
		return codigo;
		
	}

}
