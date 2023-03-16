package modelo.servicio;

import java.util.List;

import modelo.Empresas;

public interface IEmpresaServicio {
	public Empresas create(Empresas empresa);
	
	public List<Empresas> getAllEmpresasYEmpleados();
}
