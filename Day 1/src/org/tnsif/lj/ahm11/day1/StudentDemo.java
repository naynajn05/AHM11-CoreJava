package org.tnsif.lj.ahm11.day1;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1 = new Student("Yash", 12, "CSE");
		// s1.name="Nayna";
		// s1.setName("Yash");
		// System.out.println(s1.getName());
		System.out.println(s1);
		
		Student s2=new Student();
		s2.show();
		System.out.println(s2);
		
		
	}

}
