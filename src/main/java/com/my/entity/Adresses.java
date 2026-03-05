package com.my.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Adresses {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hNo;
	private String state, city;
	
	
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
