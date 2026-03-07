package com.my.main;


import java.util.ArrayList;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;


import com.my.config.stuConfiguration;
import com.my.entity.Adresses;
import com.my.entity.student;

public class studentRunner {
	

   public static void main(String [] args) {
	   
	   Session ss = stuConfiguration.getSessionFactory().openSession();
	   Transaction tx = ss.beginTransaction();
	   
	   student st1 = new student();
	   st1.setName("Salman");
	   st1.setGender("Male");
	   st1.setAge(21);
	   
	   student st2 = new student();
	   st2.setName("Sonu");
	   st2.setGender("Male");
	   st2.setAge(20);
	   
	   student st3 = new student();
	   st3.setName("adan");
	   st3.setGender("Male");
	   st3.setAge(16);
	   
	   Adresses ads1 = new Adresses();
	   ads1.setCity("Baluwa");
	   ads1.setState("UP");
	   
	   Adresses ads2 = new Adresses();
	   ads2.setCity("kushinagar");
	   ads2.setState("UP");
	   
	   Adresses ads3 = new Adresses();
	   ads3.setCity("Gorakhpur");
	   ads3.setState("UP");
	  
	  ArrayList<Adresses> list1 = new ArrayList<>();
	  list1.add(ads1);
	  list1.add(ads2);
	  list1.add(ads3);
	  st1.setAdresses(list1);
	  
	  ArrayList<Adresses> list2 = new ArrayList<>();
	  list2.add(ads1);
	  list2.add(ads2);
	  list2.add(ads3);
	  st2.setAdresses(list2);
	  
	  ArrayList<Adresses> list3 = new ArrayList<>();
	  list3.add(ads1);
	  list3.add(ads2);
	  list3.add(ads3);
	  st3.setAdresses(list3);
	  
	   
	   
//	   ss.persist(st1);
//	   ss.persist(st2);
//	   ss.persist(st3);
//	   tx.commit();
	   
//	   student std1 =ss.find(student.class, 3);
//	   System.out.println(std1);
//	   System.out.println(std1.getAdresses());
	   
	   Adresses add = ss.find(Adresses.class, 3);
	   System.out.println(add);
	   System.out.println(add.getStudent());
	   
	   
	   ss.close();
	   
	   }
}
