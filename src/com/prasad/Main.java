package com.prasad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		Configuration configuration = new Configuration().configure();
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Person p = new Person();
		p.setfName("varada");
		p.setlName("prasanna");
		p.setEmail("varadaprasad@ganil.com");
		p.setAge(22);

		/*
		 * Employee e=new Employee(); e.setSal(33333); session.save(e);
		 */

		
		session.save(p);

		tx.commit();
		session.close();

	}

}
