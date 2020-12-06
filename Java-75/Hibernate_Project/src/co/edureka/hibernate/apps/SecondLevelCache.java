package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SecondLevelCache {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		Student st1 = session1.get(Student.class, 101);
		System.out.println(st1);
		
		System.out.println("--------------------------------");
		
		Student st2 = session2.get(Student.class, 101);
		System.out.println(st2);
		
		session1.close();
		session2.close();
		sf.close();
	}

}
