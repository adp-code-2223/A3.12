package modelo;

public abstract class Empleados {
	
	private String dni;
	private String nombre;
	private String telefono;
	protected float porcentaRetencion;
	
	public abstract float calculoNomina() ;

}
