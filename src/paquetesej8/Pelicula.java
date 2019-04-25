package paquetesej8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Pelicula implements Comparable<Pelicula> {

	DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	static int terror = 0;

	static int ficcion = 0;

	static int comedia = 0;

	private Clave clave;

	private String nombre;

	private LocalDate fechaestreno;
	
	private LocalDate fechaDVD;

	Clave getClave() {
		return clave;
	}

	String getNombre() {
		return nombre;
	}

	LocalDate getFechaestreno() {
		return fechaestreno;
	}

	public LocalDate getFechaDVD() {
		return fechaDVD;
	}

	

	public String toString() {
		
		return String.format("%-40s%-40s%-40s%-40s%-40s", clave.toString().charAt(0) == 'T'?"TERROR":clave.toString().charAt(0) == 'C'?"COMEDIA":"FICCION", nombre, "Clave: " + clave.toString(), "Fecha Estreno: " + fechaFormateada.format(fechaestreno), "Fecha DVD: " +fechaFormateada.format(fechaDVD));
		
	}

	public Pelicula(String nombre, Genero genero, LocalDate fechaestreno, LocalDate fechaDVD) {
		this.nombre = nombre;
		this.clave = asignarClave(genero);
		this.fechaestreno = fechaestreno;
		this.fechaDVD = fechaDVD;
	}
	
	public Pelicula(Pelicula original) {
		
		nombre = original.nombre;
		
		clave = original.clave;
		
		fechaestreno = original.fechaestreno;
		
		fechaDVD = original.fechaDVD;
		
	}

	private Clave asignarClave(Genero genero) {

		if (genero == Genero.COMEDIA) {

			comedia++;

			return new Clave(Genero.COMEDIA, comedia);

		}

		else if (genero == Genero.TERROR) {

			terror++;

			return new Clave(Genero.TERROR, terror);

		}

		else {

			ficcion++;

			return new Clave(Genero.FICCION, ficcion);

		}

	}
	
	Integer numdias () {
		
		return (int)ChronoUnit.DAYS.between(fechaestreno, fechaDVD);
		
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
		if (!(obj instanceof Pelicula))
			return false;
		Pelicula other = (Pelicula) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}

	
	@Override
	public int compareTo(Pelicula peli) {
		
		int resultado = Integer.compare(numdias(), peli.numdias());
		
		if (resultado != 0) {
			
			return resultado;
			
		}
		
		return getNombre().compareTo(peli.getNombre());
		
	}



}
