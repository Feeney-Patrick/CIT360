package feeney.hibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

public class TestDAO {

	SessionFactory factory = null;
	Session session = null;
	
	private static TestDAO single_instance = null;
	
	private TestDAO() {
		factory = HibernateUtils.getSessionFactory();
	}
	
	public static TestDAO getInstance() {
		if (single_instance == null) {
			single_instance = new TestDAO();
		}
		
		return single_instance;
	}
	
	public List<Student> getStudents() {
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from feeney.hibernateTest.Student";
			List<Student> cs = (List<Student>)session.createQuery(sql).getResultList();
			session.getTransaction().commit();
			return cs;
		} catch(Exception e) {
			e.printStackTrace();
			//Rollback in case of an error occurred
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
	
	public Student getStudent(int id) {
		
		try {
			session = factory.openSession();
			session.getTransaction().begin();
			String sql = "from feeney.hibernateTest.Student where id =" + Integer.toString(id);
			Student s = (Student)session.createQuery(sql).getSingleResult();
			session.getTransaction().commit();
			return s;
			
		} catch(Exception e) {
			e.printStackTrace();
			//Rollback in case of an error
			session.getTransaction().rollback();
			return null;
		} finally {
			session.close();
		}
	}
}
