package com.cognizant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Entityrecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPADemo");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
//		Student s1 = new Student(1, "raja", 98);
//		Student s2 = new Student(2,"ramesh",67);
		
		Student st = em.find(Student.class, 1);
		st.setMarks(400);
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
		em.persist(st);
		
		et.commit();
		em.close();
		emf.close();
		
	}

}
