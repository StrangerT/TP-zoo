
public class Scooter implements IVehicul{
	private int nbWheel;
	private String color;
	private int speed;
	private int serialNumber;
	private static int count = 0;
	
	public Scooter (){
		this.nbWheel = 2;
		this.serialNumber = ++count;
	}
	
	public Scooter (String clr){
		this();
		this.color = clr;
	}
	
	public int getNbWheel() {
		return nbWheel;
	}

	public void setNbWheel(int nbWheel) {
		this.nbWheel = nbWheel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(this.speed); //factorisation de code en rajoutant l'affichage pour chaque setSpeed
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Scooter.count = count;
	}

	public void accelerate(){
		this.setSpeed(this.speed + 10);
	}
	
	public void deccelerate(){
		this.setSpeed(this.speed - 10);
	}
	
	public void stop() {
		this.setSpeed(0);
	}
	
	public boolean ifStop(){
		if (this.speed == 0) {
			return true;
		}
		return false;
	}
	
	@Override
	public void drive() {
		this.setSpeed(50);
		
		// TODO Auto-generated method stub
	}

}
