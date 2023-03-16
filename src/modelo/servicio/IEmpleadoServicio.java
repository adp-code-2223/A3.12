package modelo.servicio;

import modelo.Empleados;

public interface IEmpleadoServicio {
	public Empleados create(Empleados empleado);
	
	public boolean delete(String dni) throws Exception;
}
