package com.my.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.my.config.stuConfiguration;
import com.my.entity.student;

public class studentRunner {
   public static void main(String [] args) {
	   student st = new student("Annu","Male",22,"India");
	   
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
	   
	   ss.persist(st);
	   tx.commit();
	   }
}
