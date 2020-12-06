package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
		
		/*---- approach-1 for updating student ----*/
		//Student st = new Student(101,"Sunil Joseph","sunil@edureka.co","1111111111");
		//session.update(st);
		
		
		/*---- approach-2 for updating student ----*/
		
		Student st = session.get(Student.class, 102);
		if(st != null) {
			System.out.println(st);
			st.setSname("Anil Kumar"); //dirty object
		}
		else
			System.out.println("No matching student found!");		
		
		session.getTransaction().commit();
		session.close();
		sf.close();	
	}
}
