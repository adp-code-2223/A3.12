package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;

@Entity
@Table(name = "empresa")
public class Empresas implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = 1L;
	@Id
	//@Column(name="empresa_cif", length = 15)
	private String cif;
	private String nombre;
	private String direccion;
	private String telefono;
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "empresa", cascade = CascadeType.REMOVE)
	@BatchSize(size = 2)
	private Set<Empleados> empleados = new HashSet<>();

	
	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Set<Empleados> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Set<Empleados> empleados) {
		this.empleados = empleados;
	}

	@Override
	public String toString() {
		return "Empresas [cif=" + cif + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono
				+ "]";
	}

	
	
}
