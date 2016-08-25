package Animal;

public class Mollusc extends Animal{
	protected boolean radula;
	
	
	public Mollusc(){
		
	}
	public Mollusc(boolean radula) {
		this.radula = radula;
	}
	
	public Mollusc(boolean radula, boolean collagen){
		super(collagen);
		this.radula = radula;
	}
	
	public void createLimestone(){
		System.out.println("Faire du calcaire");
	}

}
