//to demonstrate encapsulation
package org.tnsif.lj.ahm11.day1;

public class Student {
	// data member
	private String name;
	private int id;
	private String dept;

	
	//default constructor
	public Student() {
		super();
	}
	//constructor
	public Student(String name, int id, String dept) {
		
		this.name = name;
		this.id = id;
		this.dept = dept;
	}

	

	// getter & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
  public void show()
  {
	  System.out.println("Show method");
  }
	
	
	// Object
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}

}
