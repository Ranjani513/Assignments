package com.nisum.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.nisum.model.Address;
import com.nisum.model.Applicant;
import com.nisum.util.HibernateUtil;

public class Main {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Applicant applicant = new Applicant();
		applicant.setFirstName("Ranjani");
		applicant.setLastName("Busim");
		applicant.setAge(21);
		applicant.setEducation("Engineer");
		
		Address currentAdd = new Address();
		currentAdd.setStreet("balaji");
		currentAdd.setCity("Hyderabad");
		currentAdd.setZipcode("264463");
		
		currentAdd.setApplicant(applicant);
		Address permanentAdd = new Address();
		permanentAdd.setStreet("vashista");
		permanentAdd.setCity("mumbai");
		permanentAdd.setZipcode("232135");
		
		permanentAdd.setApplicant(applicant);
		session.persist(applicant);
		session.persist(currentAdd);
		session.persist(permanentAdd);
		t.commit();
		session.close();
		System.out.println("successfully updated Applicant details");
	}

}
