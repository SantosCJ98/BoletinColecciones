package paquetesej9;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Examen implements Comparable<Examen> {

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
		if (!(obj instanceof Examen))
			return false;
		Examen other = (Examen) obj;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		return true;
	}

	DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH:mm");

	DateTimeFormatter fechaFormateada = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	String asignatura;

	String descripcion;

	LocalDate fecha;

	LocalTime horainicio;

	LocalTime horafin;

	Clave clave;

	Examen(String asignatura, String descripcion, LocalDate fecha, LocalTime horainicio, LocalTime horafin) {

		this.asignatura = asignatura;

		this.descripcion = descripcion;

		this.fecha = fecha;

		this.horainicio = horainicio;

		this.horafin = horafin;

		this.clave = new Clave(fecha, horainicio);

	}

	public String toString() {

		return String.format("%-30s%-30s%-30s%-30s%-30s%-30s", getAsignatura(), getDescripcion(),
				fechaFormateada.format(getFecha()), horaFormateada.format(horainicio), horaFormateada.format(horafin),
				getClave().toString());

	}

	private String getAsignatura() {
		return asignatura;
	}

	private String getDescripcion() {
		return descripcion;
	}

	LocalDate getFecha() {
		return fecha;
	}

	LocalTime getHorainicio() {
		return horainicio;
	}

	private LocalTime getHorafin() {
		return horafin;
	}

	Clave getClave() {
		return clave;
	}

	// Apartado 5

	@Override
	public int compareTo(Examen examen) {

		int comp_asig = this.getAsignatura().compareTo(examen.getAsignatura());

		int comp_fecha = this.getFecha().compareTo(examen.getFecha());

		int comp_hora = this.getHorainicio().compareTo(examen.getHorainicio());

		if (comp_asig == 0) {

			if (comp_asig == 0 && comp_fecha == 0) {

				return comp_hora;

			}

			else {

				return comp_fecha;

			}

		}

		else {

			return comp_asig;

		}

	}

}
