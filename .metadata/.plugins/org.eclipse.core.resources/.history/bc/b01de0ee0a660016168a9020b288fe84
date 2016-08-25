package com.ib.zoo.entity;

public class Healer extends Personnel{
	
	private int cureChance;
	private int nbCuredMonthly;
	private boolean available;
	
	public Healer(){
		
	}
	
	public Healer(String fname, String lname){
		super(fname, lname);
		this.salary = 21600;
		this.cureChance = 20;
		this.nbCuredMonthly = 0;
	}
	
	
	public int getCureChance() {
		return cureChance;
	}
	
	public void setCureChance(int cureChance) {
		this.cureChance = cureChance;
	}
	
	public int getNbCuredMonthly() {
		return nbCuredMonthly;
	}
	
	public void setNbCuredMonthly(int nbCuredMonthly) {
		this.nbCuredMonthly = nbCuredMonthly;
	}
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void heal(Animal animal){
		
	}
	
	public void progress(){
		if (this.getNbYears() < 10) {
			this.setSalary(this.getSalary() * (1 + this.getNbYears()/100));
			this.setCureChance(this.getCureChance() + 5);
		}
		this.setNbYears(this.getNbYears() + 1);
	}
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		this.setBonus(100 * this.getNbCuredMonthly());
		return this.bonus;
	}

}
