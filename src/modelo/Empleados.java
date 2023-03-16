package modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
public abstract class Empleados implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 859936793659262713L;
	@Id
	private String dni;
	private String nombre;
	private String telefono;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="empresa_id")
	private Empresas empresa;
	protected float porcentaRetencion;

	public abstract float calculoNomina();

	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Empresas getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresas empresa) {
		this.empresa = empresa;
	}

	public float getPorcentaRetencion() {
		return porcentaRetencion;
	}

	public void setPorcentaRetencion(float porcentaRetencion) {
		this.porcentaRetencion = porcentaRetencion;
	}


	@Override
	public String toString() {
		return "Empleados [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", porcentaRetencion="
				+ porcentaRetencion + "]";
	}
	
	

}
