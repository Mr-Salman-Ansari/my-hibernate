package com.my.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Transient;

@Entity(name="Stu")
public class student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
     private int id;
     private String name;
     private String gender;
     @Column(name="stuName")
     private int age;

     @OneToOne
     private Adress adress;
     
     
	 public Adress getAdress() {
		return adress;
	}


	 public void setAdress(Adress adress) {
		 this.adress = adress;
	 }


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
		return "student [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", adress=" + adress
				+ "]";
	 }	 
     
}
