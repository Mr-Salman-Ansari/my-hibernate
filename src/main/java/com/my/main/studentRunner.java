package com.my.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.my.config.stuConfiguration;
import com.my.entity.student;

public class studentRunner {
	
	public static void DelById(int id, Session ss) {
		  MutationQuery muteQuery = ss.createMutationQuery("delete from Stu where id=:id");
		  muteQuery.setParameter("id", id);
		   System.out.println("Status : "+muteQuery.executeUpdate());
	}
	
   public static void main(String [] args) {
	   student st1 = new student("Archna","Female",22,"India");
	 
	  // Configuration cfg = new Configuration().configure(); // it is work like a midiator 
	  // SessionFactory sf = cfg.buildSessionFactory();
	   
//	 here deal with directly   
//	   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	   Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//	   
//	   SessionFactory sf = metadata.buildSessionFactory();
	    
	   Session ss = stuConfiguration.getSessionFactory().openSession();
	   Transaction tx = ss.beginTransaction();
	   
//	   student st = ss.find(student.class, 2);
	  // System.out.println(st);
	   
//	   ss.persist(st1);
//	   tx.commit();
	   
//	    Query<student> query=ss.createQuery("from Stu",student.class);
//	    System.out.println(query.list());
	   
	   // get all Record by HQL query
//	   Query q=ss.createQuery("from Stu",student.class);
//	   List list = q.list();
//	   System.out.println(list);
	   
	   //HQL to get Records with pagination
//	   Query query = ss.createQuery("from Stu",student.class);
//	   query.setFirstResult(3);
//	   query.setMaxResults(2);
//	   //List list =query.list();
//	   //System.out.println(list);
//	   System.out.println(query.list());
	   
	   //HQL update query latest
//	   MutationQuery muteQuery = ss.createMutationQuery("update Stu set name=:n where id=:i");
//	   muteQuery.setParameter("n", "Salman");
//	   muteQuery.setParameter("i", 11);
//	   muteQuery.executeUpdate();
//	   tx.commit();
	   
	   //old
//	   Query q= ss.createQuery("update Stu set name=:n where id=:i");
//	   q.setParameter("n", "Salman");
//	   q.setParameter("i", 11);
//	  System.out.println("Status :"+ q.executeUpdate());
//	   tx.commit();
	   
	   //Hql Delete Query
//	   MutationQuery muteQuery = ss.createMutationQuery("delete from Stu where id=11");
//	   System.out.println("Status : "+muteQuery.executeUpdate());
	   
	  DelById(5,ss);
	   tx.commit();
	   
	   ss.close();
	   
	   }
}
