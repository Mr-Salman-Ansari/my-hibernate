package com.my.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.my.config.stuConfiguration;
import com.my.entity.Adress;
import com.my.entity.student;

public class studentRunner {
	
	public static void DelById(int id, Session ss) {
		  MutationQuery muteQuery = ss.createMutationQuery("delete from Stu where id=:id");
		  muteQuery.setParameter("id", id);
		   System.out.println("Status : "+muteQuery.executeUpdate());
	}
	
   public static void main(String [] args) {
	   student st1 = new student();
	   st1.setName("Salman");
	   st1.setGender("Male");
	   st1.setAge(21);
	   
	   Adress ads = new Adress();
	   ads.setCity("Baluwa");
	   ads.setState("UP");
	  ads.setStudent(st1);
	  
	  
	   st1.setAdress(ads);
	    
	   Session ss = stuConfiguration.getSessionFactory().openSession();
	   Transaction tx = ss.beginTransaction();
	   
	   
	   ss.persist(ads);
	   ss.persist(st1);
	   tx.commit();
	   
	   // for get student data by id
	   student std = ss.find(student.class, 1);
	   Adress adress = ss.find(Adress.class, 2);
	   
	   System.out.println(std);
	   System.out.println(std.getAdress());
	   
	   
	   System.out.println(adress);
	   System.out.println(adress.getStudent());
	   
	   
	   ss.close();
	   
	   }
}
