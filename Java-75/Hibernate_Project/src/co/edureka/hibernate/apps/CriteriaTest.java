package co.edureka.hibernate.apps;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import co.edureka.hibernate.configs.HibernateUtils;
import co.edureka.hibernate.entity.Student;

public class CriteriaTest {

	public static void main(String[] args) throws InterruptedException {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();

		Criteria criteria = session.createCriteria(Student.class);
		criteria.setMaxResults(50);
		//criteria.addOrder(Order.asc("sname"));
		criteria.addOrder(Order.desc("sname"));
		criteria.add(Restrictions.between("studid", 101, 120));
		//criteria.add(Restrictions.like("sname", "s%"));
		criteria.add(Restrictions.ilike("sname", "s%"));
		
		List<Student> students = criteria.list();
		
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(1000);
		}		
		
		System.out.println("------------------------------------------");
		
		//from Hibernate 5.2 (HCQL)
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Student> criter = builder.createQuery(Student.class);
		criter.from(Student.class);//to specify query roots
		Query<Student> q= session.createQuery(criter);

		 List<Student> studs = q.getResultList();
		 for(Student st : studs) {
		    System.out.println(st);
		    Thread.sleep(1000);
		 }
		 

		session.close();
		sf.close();
	}
}
