package computer;

public class Computer {

	protected String keyboard;
	
	public Computer(){
		this.keyboard = "azerty";
	}
	
	public Computer(String keyboard){
		System.out.println("MERE DEFAUT");
		this.keyboard = keyboard;
	}
	
	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}

	public void sayHello(){
		System.out.println("Je suis un ordinateur.");
	}
	
}