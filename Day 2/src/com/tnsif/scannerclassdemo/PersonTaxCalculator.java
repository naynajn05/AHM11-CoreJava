package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class PersonTaxCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		System.out.println("Enter your gender");
		String gender=sc.next();
		
		System.out.println("Enter your income");
		int income=sc.nextInt();
		
		Person p1=new Person(name,age,gender,income);
		TaxCalculator tax=new TaxCalculator();
		tax.calTax(p1);
		
		System.out.println(p1);
	}

}
