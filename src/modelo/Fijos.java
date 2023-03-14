package modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="empleados_id")
public class Fijos extends Empleados {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int salarioBase;
	private int trienios;
	
	@Override
	public float calculoNomina() {
		float sueldo = (salarioBase+trienios)*(1-porcentaRetencion);
		
		return sueldo;
		
	}

	public int getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getTrienios() {
		return trienios;
	}

	public void setTrienios(int trienios) {
		this.trienios = trienios;
	}
	
	
	

}
