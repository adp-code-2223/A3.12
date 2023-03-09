package modelo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Empresas implements Serializable {
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
private String cif;
private String nombre;
private String direccion;
private String telefono;
private Set<Empleados> empleados= new HashSet<>();





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




}
