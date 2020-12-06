package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		Student st1 = session.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println("--------------------------------");
		
		Student st2 = session.get(Student.class, 101);
		System.out.println(st2);
		
		session.close();
		sf.close();
	}
}
