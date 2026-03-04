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
	   student st1 = new student("Archna","Female",22);
	   Adress ads = new Adress("Kushinagar","UP");
	 
	   
	   st1.setAdress(ads);
	    
	   Session ss = stuConfiguration.getSessionFactory().openSession();
	   Transaction tx = ss.beginTransaction();
	   
	   
	   ss.persist(ads);
	   ss.persist(st1);
	   tx.commit();
	   
	   
	   ss.close();
	   
	   }
}
