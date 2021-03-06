package com.ib.zoo.entity;

public abstract class Personnel {
	
	protected String firstname;
	protected String lastname;
	protected double salary;
	protected double bonus; //to be redefined in each child class
	protected int seniority;
	protected double nbYears;
		
	public Personnel(){
	}
	
	public Personnel(String fname, String lname){
		this.firstname = fname;
		this.lastname = lname;
		this.seniority = 0;
		this.bonus = 0;
	}
	
	public double getPaid(){
		double salaryMonthly = this.getBonus() + this.getSalary() / 12;
		return salaryMonthly;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public double getSalary() {
		return salary;
	}
	
	
	public int getSeniority() {
		return this.seniority;
	}

	public double getNbYears() {
		this.setNbYears(this.getSeniority() / 360);
		return nbYears;
	}

	public void setNbYears(double nbYears) {
		this.nbYears = nbYears;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

//	public void progress(){
//		
//	}
//	
	

	
}
