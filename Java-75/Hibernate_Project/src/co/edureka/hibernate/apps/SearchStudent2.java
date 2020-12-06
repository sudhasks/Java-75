package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class SearchStudent2 {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		//Student st = session.get(Student.class, 101);		
		Student st = session.get(Student.class, 1015);
		if(st != null)
			System.out.println(st);
		else
			System.out.println("No matching student found!");
		
		session.close();
		sf.close();	
	}
}
