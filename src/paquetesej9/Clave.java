package paquetesej9;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Clave {
	
	DateTimeFormatter horaFormateada = DateTimeFormatter.ofPattern("HH:mm");
	
	LocalDate dia;
	
	LocalTime hora;
	
	Clave(LocalDate dia, LocalTime hora) {
		
		this.dia = dia;
		
		this.hora = hora;
		
	}
	
	public String toString() {
		
		return String.format("%s-%s", String.valueOf(getDia().getDayOfMonth()), horaFormateada.format(getHora()));
	
	}

	LocalDate getDia() {
		return dia;
	}

	LocalTime getHora() {
		return hora;
	}


}
