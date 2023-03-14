package modelo.servicio;

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

}
