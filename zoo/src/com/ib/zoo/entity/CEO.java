package com.ib.zoo.entity;

public class CEO extends Personnel{
	private Zoo zoo;
	
	public CEO(){
		
	}
	
	public CEO(String fname, String lname, Zoo zoo){
		super(fname, lname);
		this.salary = 42000;
		this.zoo = zoo;
	}
	
	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		this.setBonus((this.zoo.getAccount().getMonthlyIncome() - this.zoo.getAccount().getMonthlyOutgo()) * 15 / 100 );
		return this.bonus;
	}
	
	public void recruit(int i, String fname, String lname){
		if (i == 1) {
			this.zoo.getPersonnels().add(new Healer(fname, lname));
			System.out.println("Un soigeur/Une soigneuse a �t� embauch�(e)");
		} else if (i == 2) {
			this.zoo.getPersonnels().add(new Cleaner(fname, lname));
			System.out.println("Un agent/Une agente d'entretien a �t� embauch�(e)");
		}
	}
	
	public void dismiss(String fname, String lname){
		double severance = 0; 
		for (Personnel p : this.zoo.getPersonnels()){
			if (p.getFirstname() == fname && p.getLastname() == lname) {
				this.zoo.getPersonnels().remove(p);
				severance = p.getSalary() * p.getNbYears() * 5 / 100;
			}
		}
		this.zoo.getAccount().debitBalance(severance);

	}
	
	public void buyAnimal(){
		
	}
	
	public void sellAnimal(){
		
	}
	
	public void expand(){
		this.zoo.getAccount().debitBalance(2000);
		this.zoo.setPlaceMax(this.zoo.getPlaceMax() + 1);
	}
	
	

}
