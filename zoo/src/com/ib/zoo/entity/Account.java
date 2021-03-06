package com.ib.zoo.entity;

public class Account {
	private double balance;
	private double monthlyIncome;
	private double monthlyOutgo;
	
	public Account(){
		this.balance = 30000;
	
	}
	
	public double debitBalance(double amount){
		this.balance -= amount;
		this.setMonthlyOutgo(this.getMonthlyOutgo() + amount);
		return this.balance;
	}
	
	public double creditBalance(double amount){
		this.balance += amount;
		this.setMonthlyIncome(this.getMonthlyIncome() + amount);
		return this.balance;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public double getMonthlyOutgo() {
		return monthlyOutgo;
	}

	public void setMonthlyOutgo(double monthlyOutgo) {
		this.monthlyOutgo = monthlyOutgo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Le solde est de " + this.balance);
		return super.toString();
	}
	

}
