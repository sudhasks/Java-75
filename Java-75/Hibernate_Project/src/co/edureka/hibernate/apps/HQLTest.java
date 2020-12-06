package co.edureka.hibernate.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class HQLTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		//String hql = "from co.edureka.hibernate.entity.Student";
		String hql = "from co.edureka.hibernate.entity.Student where sname='Naveen'";		
		Query<Student> q = session.createQuery(hql);
		*/
		
		/*
		//--using positional parameters in HQL
		String hql = "from co.edureka.hibernate.entity.Student where studid between ?1 and ?2";
		Query<Student> q = session.createQuery(hql);
		q.setParameter(1, 101);
		q.setParameter(2, 105);
		*/
		
		/*
		//--using named parameters in HQL
		String hql = "from co.edureka.hibernate.entity.Student where studid between :minsid and :maxsid";
		Query<Student> q = session.createQuery(hql);
		q.setParameter("minsid", 105);
		q.setParameter("maxsid", 200);
		*/
		
		
		//--using like clause in HQL
		String hql = "from co.edureka.hibernate.entity.Student where email like '%@gmail.com'";
		Query<Student> q = session.createQuery(hql);			
		
		List<Student> students = q.getResultList();
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}
		
		/*---- to perform DML operation with HQL --*/
		Transaction tx = session.beginTransaction();
		
		hql = "update co.edureka.hibernate.entity.Student stud set stud.sname='Sunil' where stud.studid=101";
		q=session.createQuery(hql);
		int rows_affected = q.executeUpdate();
		System.out.println("records affected = "+ rows_affected);
		
		tx.commit();
		session.close();
		sf.close();			
	}
}
