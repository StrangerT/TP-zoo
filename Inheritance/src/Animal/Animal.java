package Animal;

public class Animal {
	protected boolean collagen;
	
	public Animal(){
		
	}
	
	public Animal(boolean collagen) {
		this.collagen = collagen;
	}
	
	public void breath(){
		System.out.println("Respirer");
	}

}
