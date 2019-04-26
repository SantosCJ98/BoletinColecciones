package paquetesej9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clave implements Comparable<Clave> {

	private LocalDate dia;

	private LocalTime hora;

	Clave(LocalDate dia, LocalTime hora) {

		this.dia = dia;

		this.hora = hora;

	}

	public String toString() {

		DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH:mm");

		return String.format("%s-%s", String.valueOf(getDia().getDayOfMonth()), horaFormateada.format(getHora()));

	}

	private LocalDate getDia() {
		return dia;
	}

	private LocalTime getHora() {
		return hora;
	}

	@Override
	public int compareTo(Clave clave) {

		return toString().compareTo(clave.toString());

	}

}
