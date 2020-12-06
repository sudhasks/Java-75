package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.edureka.hibernate.entity.Student;

public class SaveStudent {

	public static void main(String[] args) {
		//to read details from configuration files
		Configuration config = new Configuration();
		config.configure("co/edureka/hibernate/configs/hibernate.cfg.xml"); //XML parsing
		
		//create SessionFactory
		SessionFactory sfactory = config.buildSessionFactory();
		
		//create a Session
		Session session = sfactory.openSession();
		
		//create Transaction
		Transaction tx = session.beginTransaction();
		
		//create a Student instance
		Student st = new Student(101,"Sunil","sunil@hotmail.com","9848586878");
		
		//save the entity instance with hibernate session
		session.save(st);
		System.out.println("---------------------------------");
		
		//commit the transaction ; so that SQL query will be generated and get connected and executes in DB
		tx.commit();
		System.out.println("Student Saved ------");
		
		//close session and session factory
		session.close();
		sfactory.close();
	}
}
