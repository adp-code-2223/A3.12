package main;

import java.time.LocalDate;
import java.util.List;

import modelo.Empresas;
import modelo.Fijos;
import modelo.Temporales;
import modelo.servicio.EmpleadoServicio;
import modelo.servicio.EmpresaServicio;
import modelo.servicio.IEmpleadoServicio;
import modelo.servicio.IEmpresaServicio;

public class Main {
	
	private static IEmpresaServicio empresaServicio= new EmpresaServicio();
	private static IEmpleadoServicio empleadoServicio= new EmpleadoServicio();
	
	public static void main(String[] args) {
		
		Empresas empresa = new Empresas();
		empresa.setCif("1111bbbbcccc");
		empresa.setDireccion("Vigo");
		empresa.setNombre("My Cía");
		empresa.setTelefono("986 123 123");
		
		empresaServicio.create(empresa);
		
		
		
		Fijos fijo_1 = new Fijos();
		fijo_1.setDni("12341234A");
		fijo_1.setEmpresa(empresa);
		fijo_1.setNombre("Yo soy fijo");
		fijo_1.setPorcentaRetencion(0.2f);
		fijo_1.setSalarioBase(30000);
		fijo_1.setTelefono("986 123 123");
		fijo_1.setTrienios(0);
		
		Temporales temp_1 = new Temporales();
		temp_1.setDni("11112222B");
		temp_1.setEmpresa(empresa);
		temp_1.setFechaFin(LocalDate.of(2023, 1, 10));
		temp_1.setFechaInicio(LocalDate.of(2023, 1, 1));
		temp_1.setNombre("Yo soy el temporal");
		temp_1.setPagoDia(60);
		temp_1.setPorcentaRetencion(0.2f);
		temp_1.setSuplemento(500);
		temp_1.setTelefono("986 123 444");
		
		
		empleadoServicio.create(fijo_1);
		empleadoServicio.create(temp_1);
		
		
		try {
			String empno= "12341234A";
			if(empleadoServicio.delete(empno)) {
				System.out.println("Se ha borrado correctamente el empleado con id: " + empno);
			}
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido una exception en delete "+ e.getMessage());
			//e.printStackTrace();
		}
		
		
		List<Empresas> empresas = empresaServicio.getAllEmpresasYEmpleados();
		
	}

}
