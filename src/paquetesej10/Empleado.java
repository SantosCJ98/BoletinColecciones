package paquetesej10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Empleado implements Comparable<Empleado> {

	DateTimeFormatter fechaformat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private static int jefe = 0;

	private static int empleado = 0;

	private static int encargado = 0;

	Empleado(String nombre, Categoria categoria, LocalDate fechaalta, LocalDate fechabaja) {

		this.nombre = nombre;

		this.clave = asignarClave(categoria);

		this.fechaalta = fechaalta;

		this.fechabaja = fechabaja;

	}

	private Clave asignarClave(Categoria categoria) {

		if (categoria.getCodigo() == 'J') {

			jefe++;

			return new Clave(Categoria.JEFE, jefe);

		}

		else if (categoria.getCodigo() == 'E') {

			encargado++;

			return new Clave(Categoria.ENCARGADO, encargado);

		}

		else {

			empleado++;

			return new Clave(Categoria.EMPLEADO, empleado);

		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}

	private Clave clave;

	private String nombre;

	private LocalDate fechaalta;

	private LocalDate fechabaja;

	Integer numdias() {

		if (fechabaja != null) {

			return (int) ChronoUnit.DAYS.between(fechaalta, fechabaja);

		}

		else {

			return (int) ChronoUnit.DAYS.between(fechaalta, LocalDate.now());

		}

	}

	Clave getClave() {
		return clave;
	}

	String getNombre() {
		return nombre;
	}

	private LocalDate getFechaalta() {
		return fechaalta;
	}

	private LocalDate getFechabaja() {
		return fechabaja;
	}

	public String toString() {

		return String.format("%-50s%-50s%-50s%-50s%-50s%-50s",
				getClave().toString().charAt(0) == 'J' ? "JEFE"
						: getClave().toString().charAt(0) == 'D' ? "EMPLEADO" : "ENCARGADO",
				"Nombre: " + getNombre(), "Clave: " + getClave().toString(),
				"Fecha alta: " + fechaformat.format(fechaalta),
				fechabaja == null ? "Fecha baja: no tiene" : "Fecha baja " + fechaformat.format(fechabaja),
				"Dias trabajados: " + numdias());

	}

	// Apartado 1

	@Override
	public int compareTo(Empleado emp1) {
		return emp1.numdias().compareTo(this.numdias());
	}

	// Apartado 2

//	@Override
//	public int compareTo(Empleado emp1) {
//		return this.getNombre().compareTo(emp1.getNombre());
//	}

	// Apartado 3

//		@Override
//		public int compareTo(Empleado empleado) {
//			
//			if (this.getClave().toString().charAt(0) > empleado.getClave().toString().charAt(0))  {
//				
//				return -1;	
//				
//			}
//			
//			else if (this.getClave().toString().charAt(0) < empleado.getClave().toString().charAt(0))  {
//				
//				return 1;	
//				
//			}
//			
//			else {
//				
//				if (this.getClave().getNumero() < empleado.getClave().getNumero()) {
//					
//					return -1;
//					
//				}
//				
//				else if (this.getClave().getNumero() > empleado.getClave().getNumero()) {
//					
//					return 1;
//					
//				}
//				
//				else {
//					
//					return 0;
//					
//				}
//				
//				
//			}

}
