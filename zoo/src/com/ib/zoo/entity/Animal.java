package com.ib.zoo.entity;

import java.util.Random;

public class Animal {
	protected Sex sex;
	protected Rarity rarity;
	protected int ageMax;
	protected int age;
	protected int beginGestation;
	protected int endGestation;
	protected int gestationDuration;
	protected int sickChance;
	protected int deathChance;
	protected double price;
	protected boolean ifSick;
	protected boolean ifCleaned;
	protected boolean ifPregnant;
	protected int nbDaySick;
	protected int nbDayNonCleaned;
	protected int nbVisitors;
	
	
	public Animal() {
		this.sex = (Math.random() < 0.5) ? Sex.Male : Sex.Female;
		
	}
	
	

	public int getNbVisitors() {
		int n = 0;
		switch (this.rarity) {
		case Rare:
			n = (int) (Math.random() * 5 + 8);
			break;
		case Uncommon:
			n = (int) (Math.random() * 4 + 5);
			break;

		default:
			n = (int) (Math.random() * 3 + 3);
			break;
		}
		this.nbVisitors = n;
		return nbVisitors;
	}



	public Sex getSex() {
		return sex;
	}

	public Rarity getRarity() {
		return rarity;
	}

	public int getAgeMax() {
		return ageMax;
	}

	public int getAge() {
		return age;
	}

	public int getBeginGestation() {
		return beginGestation;
	}

	public int getEndGestation() {
		return endGestation;
	}

	public int getGestationDuration() {
		return gestationDuration;
	}

	public int getSickChance() {
		this.sickChance = (this.ifCleaned) ? this.age / 360: this.age / 360 + 10;
		return sickChance;
	}

	public int getDeathChance() {
		this.deathChance = (this.ifSick) ? 1 + this.nbDaySick * 3 : 1;
		return deathChance;
	}

	public double getPrice() {
		double ratio = 0;
		double priceBase = 0;
		switch (this.getRarity()) {
		case Rare:
			priceBase = 10000;
			ratio = 30;
			break;
		case Uncommon:
			priceBase = 5000;
			ratio = 10;
			break;
		default:
			priceBase = 3000;
			break;
		}
		if (this.ifPregnant) {
			ratio += 40;
		}
		if (this.ifSick) {
			ratio -= 20;
		}
		if (!this.ifCleaned) {
			ratio -= this.nbDayNonCleaned * 2;			
		}
		if (this.getAge() >= 0.95 * this.getAgeMax()) {
			ratio -= 70;
		} else if (this.getAge() >= 0.9 * this.getAgeMax()) {
			ratio -= 50;
		} else if (this.getAge() >= 0.8 * this.getAgeMax()) {
			ratio -= 30;
		} else if (this.getAge() >= 0.75 * this.getAgeMax()) {
			ratio -= 20;
		} else if (this.getAge() <= 0.3 * this.getAgeMax()) {
			ratio += 15;
		}
		this.setPrice(priceBase * ratio);
		return price;
	}

	public boolean isIfSick() {
		return ifSick;
	}

	public boolean isIfCleaned() {
		return ifCleaned;
	}

	public boolean isIfPregnant() {
		return ifPregnant;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public void setRarity(Rarity rarity) {
		this.rarity = rarity;
	}

	public void setAgeMax(int ageMax) {
		this.ageMax = ageMax;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBeginGestation(int beginGestation) {
		this.beginGestation = beginGestation;
	}

	public void setEndGestation(int endGestation) {
		this.endGestation = endGestation;
	}

	public void setGestationDuration(int gestationDuration) {
		this.gestationDuration = gestationDuration;
	}

	public void setSickChance(int sickChance) {
		this.sickChance = sickChance;
	}

	public void setDeathChance(int deathChance) {
		this.deathChance = deathChance;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setIfSick(boolean ifSick) {
		this.ifSick = ifSick;
	}

	public void setIfCleaned(boolean ifCleaned) {
		this.ifCleaned = ifCleaned;
	}

	public void setIfPregnant(boolean ifPregnant) {
		this.ifPregnant = ifPregnant;
	}
	
	

}
