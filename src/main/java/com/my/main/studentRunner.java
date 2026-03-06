package com.my.main;

import java.util.ArrayList;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;


import com.my.config.stuConfiguration;
import com.my.entity.Adresses;
import com.my.entity.student;

public class studentRunner {
	
	public static void DelById(int id, Session ss) {
		  MutationQuery muteQuery = ss.createMutationQuery("delete from Stu where id=:id");
		  muteQuery.setParameter("id", id);
		   System.out.println("Status : "+muteQuery.executeUpdate());
	}
	
   public static void main(String [] args) {
//	   student st1 = new student();
//	   st1.setName("Salman");
//	   st1.setGender("Male");
//	   st1.setAge(21);
//	   
//	   Adresses ads1 = new Adresses();
//	   ads1.setCity("Baluwa");
//	   ads1.setState("UP");
//	   ads1.setStudent(st1);
//	   
//	   Adresses ads2 = new Adresses();
//	   ads2.setCity("kushinagar");
//	   ads2.setState("UP");
//	   ads2.setStudent(st1);
//	   
//	   Adresses ads3 = new Adresses();
//	   ads3.setCity("Gorakhpur");
//	   ads3.setState("UP");
//	   ads3.setStudent(st1);
//	  
//	  ArrayList<Adresses> listofAdd = new ArrayList<>();
//	  listofAdd.add(ads1);
//	  listofAdd.add(ads2);
//	  listofAdd.add(ads3);
//	  
//	  st1.setAdresses(listofAdd);
	  
	  
	    
	   Session ss = stuConfiguration.getSessionFactory().openSession();
	   Transaction tx = ss.beginTransaction();
	   
	   
//	   ss.persist(ads1);
//	   ss.persist(ads2);
//	   ss.persist(ads3);
//	   ss.persist(st1);
//	   tx.commit();
	   
//	   student std1 =ss.find(student.class, 1);
//	   System.out.println(std1);
//	   System.out.println(std1.getAdresses());
	   
	   Adresses std1 =ss.find(Adresses.class, 2);
	   System.out.println(std1);
	   System.out.println(std1.getStudent());
	   
	   
	   ss.close();
	   
	   }
}
