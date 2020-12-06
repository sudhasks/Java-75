package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SearchStudent1 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st = new Student();
		System.out.println(st);
		
		try {
			//session.load(st, 101);
			session.load(st, 1015);
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
		}
		System.out.println(st);
		session.close();
		sf.close();
	}
}
