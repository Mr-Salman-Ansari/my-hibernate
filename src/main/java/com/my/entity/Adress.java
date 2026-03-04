package com.my.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Adress {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hNo;
	private String state, city;
	@OneToOne
	private student Student;
	
	
	public Adress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Adress(String state, String city) {
		super();
		this.state = state;
		this.city = city;
	}


	
	
	public student getStudent() {
		return Student;
	}


	public void setStudent(student student) {
		Student = student;
	}


	public int gethNo() {
		return hNo;
	}


	public void sethNo(int hNo) {
		this.hNo = hNo;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Adress [hNo=" + hNo + ", state=" + state + ", city=" + city + "]";
	}
	
}
