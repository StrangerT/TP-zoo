package com.ib.zoo.entity;

import java.util.ArrayList;

public class Zoo {
	private Account account;
	private ArrayList<Animal> animals;
	private ArrayList<Personnel> personnels;
	private CEO ceo;
	
	private int placeMax;
	
	public Zoo(){
		this.placeMax = 5;
		this.account = new Account();
		this.getAccount().setBalance(30000);
		this.animals = new ArrayList<Animal>();
		this.personnels = new ArrayList<Personnel>();
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public ArrayList<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}

	public ArrayList<Personnel> getPersonnels() {
		return personnels;
	}

	public void setPersonnels(ArrayList<Personnel> personnels) {
		this.personnels = personnels;
	}

	

	public int getPlaceMax() {
		return placeMax;
	}

	public void setPlaceMax(int placeMax) {
		this.placeMax = placeMax;
	}

	public void setCeo(CEO ceo) {
		this.ceo = ceo;
		
	}
	
	

}
