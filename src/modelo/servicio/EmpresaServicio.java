package modelo.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import modelo.Empresas;
import util.SessionFactoryUtil;

public class EmpresaServicio implements IEmpresaServicio {

	@Override
	public Empresas create(Empresas empresa) {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();

		Transaction tx = null;
		try (Session session = sf.openSession()) {
			tx = session.beginTransaction();
			session.save(empresa);
			tx.commit();

		} catch (Exception ex) {
			System.out.println("Ha ocurrido una exception: " + ex.getMessage());

			if (tx != null) {
				tx.rollback();
			}
			empresa = null;
		}
		return empresa;
	}

	@Override
	public List<Empresas> getAllEmpresasYEmpleados() {
		SessionFactory sf = SessionFactoryUtil.getSessionFactory();
		List<Empresas> empresas = new ArrayList<>();
		
		Transaction tx = null;
		try (Session session = sf.openSession()) {
		 empresas =session.createQuery("select e from Empresas e order by e.nombre").list();
//			for (Empresas empresa : empresas) {
//				empresa.get
//			}
		}
		catch (Exception ex) {
			System.out.println("Ha ocurrido una exception: " + ex.getMessage());

			
			
		}
		return empresas;
	}

}
