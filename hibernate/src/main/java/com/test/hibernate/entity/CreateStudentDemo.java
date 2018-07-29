package com.test.hibernate.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.List;

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

			Student student2 = new Student("Mayank", "Yadav", "mayank@gmail.com");
			session.save(student2);

			//close the session
			session.getTransaction().commit();

/////////////////////////////////////////////////////////////////////////////////////////////////////


            //Creating and executing native sql query...
            //Using Native SQL
            Session session1 = factory.getCurrentSession();
            session1.beginTransaction();

            String queryString = "select * from Student";
            NativeQuery<Student> query = session1.createNativeQuery(queryString, Student.class);
            List<Student> students = query.getResultList();
            //System.out.println(students);
            for (Student student1 : students) {
                System.out.println(student1.getFirstName() + " " + student1.getLastName());
            }

            //Using HQL
            Query<Student> studentQuery = session1.createQuery("from com.test.hibernate.entity.Student");
            List<Student> studentList =   studentQuery.list();

            for (Student student1 : studentList) {
                System.out.println(student1);
            }




            session.close();

		} catch (Exception exception) {
			System.out.println("Some exception occured while creating the student object ");
			exception.printStackTrace();
		} finally {
			session.close();
			
			//to close the connection
			factory.close();
		}

	}

}
