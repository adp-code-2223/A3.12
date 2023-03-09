package modelo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Fijos extends Empleados {
	private int salarioBase;
	private int trienios;
	@Override
	public float calculoNomina() {
		float sueldo = (salarioBase+trienios)*(1-porcentaRetencion);
		//ChronoUnit.DAYS.between(LocalDateTime.now(), date2);
		return sueldo;
		
	}
	

}
