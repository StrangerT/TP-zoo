package Animal;

public class Mammal extends Animal{
	
	protected boolean keratin;
	
	public Mammal(){
		
	}
	
	public Mammal(boolean keratin) {
		super();
		this.keratin = keratin;
	}
	
	public Mammal(boolean keratin, boolean collagen){
		super(collagen);
		this.keratin = keratin;
	}
	public void breastFeeding(){
		System.out.println("Allaiter");
	}

}
