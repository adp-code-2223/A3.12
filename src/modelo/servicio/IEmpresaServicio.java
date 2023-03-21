package modelo.servicio;

import java.util.List;

import exceptions.InstanceNotFoundException;
import modelo.Empresas;

public interface IEmpresaServicio {
	public Empresas create(Empresas empresa);
	
	public List<Empresas> getAllEmpresasYEmpleados();
	
	public boolean delete(String cif) throws InstanceNotFoundException;
}
