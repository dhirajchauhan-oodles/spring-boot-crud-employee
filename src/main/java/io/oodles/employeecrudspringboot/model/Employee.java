package io.oodles.employeecrudspringboot.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String associated;
	@ElementCollection
    private List<String> skills;
	private String department;
	private int salary;
	
	public Employee() {
	}


	public Employee(int id, String name, String associated, List<String> skills, String department, int salary) {
		this.id = id;
		this.name = name;
		this.associated = associated;
		this.skills = skills;
		this.department = department;
		this.salary = salary;
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

	public String getAssociated() {
		return associated;
	}

	public void setAssociated(String associated) {
		this.associated = associated;
	}



	public List<String> getSkills() {
		return skills;
	}



	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	
	
	
	
}
