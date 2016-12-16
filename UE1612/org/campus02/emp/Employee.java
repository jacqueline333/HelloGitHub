package org.campus02.emp;

//import javax.annotation.Generated;

public class Employee {
	
	private int empNumber; 
	private String name; 
	private double salary; 
	private String department;
	
	public Employee(int empNumber, String name, double salary, String department) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}


	//autogenerierter Setter: 

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	} 
	
	
	//autogenerierter Getter:
	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

// autogenerierter toString
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", department="
				+ department + "]";
	}

	

}
