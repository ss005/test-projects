package com.test.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// 1. Create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// 2. get session
		Session session = factory.getCurrentSession();

		
		//3. 
		try {
			// credate a student object
			Student student = new Student("Sanjay", "Kumar", "sanjay@gmail.com");

			// begin transactiond
			session.beginTransaction();

			// save student object
			System.out.println("creating student object in table ");
			session.save(student);

			// commit transaction
			session.getTransaction().commit();

		} catch (Exception exception) {
			System.out.println("Some exception occured while creating the student object ");
			exception.printStackTrace();
		} finally {
			session.close();
			
			//to close the connection close 
			factory.close();
		}

	}

}
