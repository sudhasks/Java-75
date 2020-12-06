package co.edureka.hibernate.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Employee;

public class SaveEmployee {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee(101,"Sunil Joseph", 2550f);
		Integer empno = (Integer) session.save(emp);
		System.out.println("Employee with No: "+ empno+" is Saved");
		
		tx.commit();
		session.close();
		sf.close();
	}

}
