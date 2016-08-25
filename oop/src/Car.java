
public class Car {
	
	private String color;
	private int wheelNb;
	private static int count = 0;//nombre de voitures instanci�es
	
	public Car() {
		count ++;//incr�mentation de voitures
	}
	public int getCount(){
		return count;
	}
	public Car(String clr, int nb){
		color = clr;
		wheelNb = nb;
		count ++;//incr�mentation de voitures
		//this();   peut remplacer la ligne pr�cedente
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWheelNb() {
		return wheelNb;
	}

	public void setWheelNb(int wheelNb) {
		this.wheelNb = wheelNb;
	}

	public void move(){
		System.out.println("VROUM");
	};
}
