package com.tnsif.scannerclassdemo;

public class Person {
	//data members
	private String name;
	private String gender;
	private int age;
	private int income;
	private int tax;
	
	
	//Constructor
	public Person(String name, int age, String gender, int income) {
		
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.income = income;
		
	}
	//getters and setters
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
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", income=" + income + ", tax=" + tax
				+ "]";
	}
	
	

}
