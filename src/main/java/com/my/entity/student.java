package com.my.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;



@Entity
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     private String gender;
     private int age;
     @ManyToOne
     private List<Adresses> adresses;
     
     
	 public student() {
		super();
		// TODO Auto-generated constructor stub
	 }


	 public student(int id, String name, String gender, int age, List<Adresses> adresses) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.adresses = adresses;
	 }

	 
	 public List<Adresses> getAdresses() {
		 return adresses;
	 }


	 public void setAdresses(List<Adresses> adresses) {
		 this.adresses = adresses;
	 }

	 public int getId() {
		 return id;
	 }


	 public void setId(int id) {
		 this.id = id;
	 }


	 public String getName() {
		 return name;
	 }


	 public void setName(String name) {
		 this.name = name;
	 }


	 public String getGender() {
		 return gender;
	 }


	 public void setGender(String gender) {
		 this.gender = gender;
	 }


	 public int getAge() {
		 return age;
	 }


	 public void setAge(int age) {
		 this.age = age;
	 }




	 @Override
	 public String toString() {
		return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	 }

     
	 
   
}
