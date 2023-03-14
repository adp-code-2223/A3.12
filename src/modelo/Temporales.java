package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name="empleados_id")
public class Temporales extends Empleados {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1794310331056781027L;
	
	
	private LocalDate fechaInicio;
	
	
	private LocalDate fechaFin;
	
	private float pagoDia;
	private float suplemento;

	@Override
	public float calculoNomina() {
		float salario = pagoDia * ChronoUnit.DAYS.between(fechaInicio, fechaFin) * (1 - porcentaRetencion) + suplemento;
		return salario;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public float getPagoDia() {
		return pagoDia;
	}

	public void setPagoDia(float pagoDia) {
		this.pagoDia = pagoDia;
	}

	public float getSuplemento() {
		return suplemento;
	}

	public void setSuplemento(float suplemento) {
		this.suplemento = suplemento;
	}
	
	
	

}
