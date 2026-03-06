package com.my.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Adresses {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hNo;
	private String state, city;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private student Student;
	
	
	public Adresses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresses(int hNo, String state, String city) {
		super();
		this.hNo = hNo;
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
		return "Adresses [hNo=" + hNo + ", state=" + state + ", city=" + city + "]";
	}


	
	
}
