package com.cognizant;

import org.hibernate.Transaction;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHibernate {

	public static void main(String[] args) {
		
//		UserDetails ud = new UserDetails(103, "thirdUser","address1",12345);
//		Vehicle v = new Vehicle(123, "vehicle1");
//		TwoWheeler tw = new TwoWheeler(321, "bike", "sporty");
//		FourWheeler fw = new FourWheeler(567, "car", "power steering");
//		Project p = new Project(1, "project1");
//		Module m = new Module(2, "project1", "module1");
//		Task ta = new Task(3, "project1", "task1");
		Address a = new Address("palakkad", "kerala", 678007);
		UserDetails ud = new UserDetails(1, "kiranjose", a);
		
		
		
		
//		ProductDetails pd = new ProductDetails(8, "p8", 8, "b8", 800, 80, 80, "available");
		Configuration cfg = new Configuration();
		cfg.configure("Configuration.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t= s.getTransaction();
		t.begin();
		
		s.save(ud);
//		s.save(m);
//		s.save(ta);
		t.commit();
		s.close();
		System.out.println("Executed Code!!");
		
		

	}

}
