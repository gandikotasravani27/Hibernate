/**
 * 
 */
package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author 
 *
 */
public class SaveEmp {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("welcome.xml");
		SessionFactory sf =	cfg.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tr = se.beginTransaction();
		
		Employe e = new Employe();
		e.setId(1);
		e.setName("JOCT");
		e.setSalary(123.23f);
		
		se.save(e);
		
		tr.commit();
	}

}
