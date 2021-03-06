package com.ib.zoo.entity;

public class Cleaner extends Personnel{
	
	private int nbMax;
	private int nbAvailable;
	private boolean available;
	
	public Cleaner(){
		
	}
	
	public Cleaner(String fname, String lname){
		super(fname, lname);
		this.salary = 15600;
		this.nbMax = 5;
	}

	public int getNbMax() {		
		if (this.getNbYears() > 10) {
			this.nbMax = 15;
		}else {
			this.nbMax += this.getNbYears();
		}
		return nbMax;
	}

	public void setNbMax(int nbMax) {
		this.nbMax = nbMax;
	}
	
		public boolean isAvailable() {
			if (this.nbAvailable == 0) {
				this.setAvailable(false);
			} else {
				this.setAvailable(true);
			}
			
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getNbAvailable() {
		return nbAvailable;
	}

	public void setNbAvailable(int nbAvailable) {
		this.nbAvailable = nbAvailable;
	}

	public void clean(Animal animal){
		this.setNbAvailable(getNbAvailable() - 1);
		animal.setIfCleaned(true);
	}
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		if (this.getSeniority() > 10) {
			this.bonus = this.getSalary() * 5 / 100 ;
		} else {
			this.bonus = this.getSalary() * (this.getNbYears() % 2) / 100;
		}
		return this.bonus;
	}
	
	public void progress(){
		if (this.getNbYears() < 10) {
			this.setSalary(this.getSalary() * (1 + Math.floor(this.getNbYears() / 2 )/ 100));
			this.setNbMax(this.getNbMax() + 1);
		}
		this.setNbYears(this.getNbYears() + 1);
	}

}
