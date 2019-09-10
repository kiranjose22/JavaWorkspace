package com.cognizant;







import java.sql.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class BookDemo {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
//		Student s1 = new Student(1, "raja", 98);
//		Student s2 = new Student(2,"ramesh",67)
		Date today = Date.valueOf("2015-03-31");
//		Date hello = Date.valueOf("25-02-1996");
		Book b1 = new Book(3, "newbook22",today, "adsda", 3);
//		Student st = em.find(Student.class, 1);
//		st.setMarks(400);
//		em.remove(st);
//		Student s1 = new Student();
//		Student s2 = new Student();
//		
//		s1.setRollno(1);
//		s1.setName("glin");
//		
//		s2.setRollno(2);
//		s2.setName("kiran");
		
//		em.persist(s1);
//		em.persist(s2);
//		em.remove(st);
		em.persist(b1);
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
