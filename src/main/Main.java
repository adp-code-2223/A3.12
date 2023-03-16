package main;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import modelo.Empleados;
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
		
		
		Empresas empresa2 = new Empresas();
		empresa2.setCif("2222bbbbcccc");
		empresa2.setDireccion("A Coruña");
		empresa2.setNombre("Your Cía");
		empresa2.setTelefono("986 444 555");
		
		empresaServicio.create(empresa2);
		
		Empresas empresa3 = new Empresas();
		empresa3.setCif("3333bbbbcccc");
		empresa2.setDireccion("Lugo");
		empresa2.setNombre("His Cía");
		empresa2.setTelefono("982 444 555");
		
		empresaServicio.create(empresa3);
		
		
		
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
		
		
		Fijos fijo_2 = new Fijos();
		fijo_2.setDni("12341234B");
		fijo_2.setEmpresa(empresa2);
		fijo_2.setNombre("Yo soy fijo 2");
		fijo_2.setPorcentaRetencion(0.2f);
		fijo_2.setSalarioBase(30000);
		fijo_2.setTelefono("986 123 123");
		fijo_2.setTrienios(0);
		
		Fijos fijo_3 = new Fijos();
		fijo_3.setDni("12341234C");
		fijo_3.setEmpresa(empresa3);
		fijo_3.setNombre("Yo soy fijo 3");
		fijo_3.setPorcentaRetencion(0.2f);
		fijo_3.setSalarioBase(30000);
		fijo_3.setTelefono("986 123 123");
		fijo_3.setTrienios(0);
		
		
		empleadoServicio.create(fijo_1);
		empleadoServicio.create(temp_1);
		empleadoServicio.create(fijo_2);
		empleadoServicio.create(fijo_3);
		
//		
//		try {
//			String empno= "12341234A";
//			if(empleadoServicio.delete(empno)) {
//				System.out.println("Se ha borrado correctamente el empleado con id: " + empno);
//			}
//			
//		} catch (Exception e) {
//			System.out.println("Ha ocurrido una exception en delete "+ e.getMessage());
//			//e.printStackTrace();
//		}
		
		
		List<Empresas> empresas = empresaServicio.getAllEmpresasYEmpleados();
		Set<Empleados> empleados;
		for (Empresas cia : empresas) {
			System.out.println(cia);
			empleados = cia.getEmpleados();
			for (Empleados employee : empleados) {
				if(employee instanceof Temporales) {
					System.out.println("Temporal: " + employee);
				}
				else if(employee instanceof Fijos) {
					System.out.println("Fijos:" + employee);
				}	
			}
		}
//		
//		String cif= "1111bbbbcccc";
//		try {
//			if(empresaServicio.delete(cif)) {
//				System.out.println("Se ha borrado correctamente la empresa con cif: " + cif);
//			}
//		} catch (Exception e) {
//			System.out.println("Ha ocurrido una exception en delete "+ e.getMessage());
//		}
//		
	}

}
