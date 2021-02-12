package com.nisum.hibbernate;

/**
 * Hello world!
 *
 */
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nisum.hibbernate.entiry.Student;
import com.nisum.hibbernate.util.HibernateUtil;



public class App {
    public static void main(String[] args) {
    	

        Student student = new Student("Ramesh", "kasoju", "rkasoju@nisum.com");
        Student student1 = new Student("Srinivas", "ananthoju", "sananth@nisum.com");
        
        
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student);
            session.save(student1);
            // commit transaction
            transaction.commit();
            session.close();
            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        
      /*  try (Session session = HibernateUtil.getSessionFactory().openSession()) {
     	   Student load = session.load(Student.class, 1);
     	   
     	   System.out.println(load);
     	   
     	   session.close();
          
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
        
        
        */
        
        
        
        
        
        
        
        
        
        
        
        

      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List < Student > students = session.createQuery("from Student", Student.class).list();
            students.forEach(s -> System.out.println(s.getFirstName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } 
       
       
       
       
      
       
       
       
       
    }
    
    
    
    
    
}