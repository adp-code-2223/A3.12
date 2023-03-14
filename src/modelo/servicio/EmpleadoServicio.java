package modelo.servicio;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Empleados;
import util.SessionFactoryUtil;

public class EmpleadoServicio implements IEmpleadoServicio {

	@Override
	public Empleados create(Empleados empleado) {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory(); 
		Transaction tx = null;
		try (Session session = sf.openSession()) {
			tx = session.beginTransaction();
			session.save(empleado);
			tx.commit();

		} catch (Exception ex) {
			System.out.println("Ha ocurrido una exception: " + ex.getMessage());

			if (tx != null) {
				tx.rollback();
			}
			empleado = null;
		}
		return empleado;
	}

}
