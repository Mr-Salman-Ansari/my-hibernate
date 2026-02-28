package com.my.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//@Entity(name="Stu")
public class student {
	//@Id
     private int id,age;
     private String name, gender;
  
     
     
	 public student(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	 }


	 public student() {
		super();
		// TODO Auto-generated constructor stub
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
