import java.util.ArrayList;

public class Person {
	
	private String lastName;
	private String firstName;
	private char sex;
	private int numberSecu;
	private static int count = 0;
	private ArrayList<Scooter> scooters;
	private House myHouse;
	
	public Person() {// surcharge d'un constructeur par default si vide
		sex = 'M';
		numberSecu = ++count;
		scooters = new ArrayList<Scooter>();
		myHouse = new House();
	}
	
	public Person(String fname) {
		this();
		firstName = fname;
	}
	
	public Person(String fname, String lname){
		this();
		lastName = lname;
	}
	
	public void buyScooter(String color){
		this.scooters.add(new Scooter(color));
	}
	
	
	public ArrayList<Scooter> getScooters() {
		return scooters;
	}

	public void setScooters(ArrayList<Scooter> scooters) {
		this.scooters = scooters;
	}

	public House getMyHouse() {
		return myHouse;
	}

	public void setMyHouse(House myHouse) {
		this.myHouse = myHouse;
	}

	public static int getCount(){
		return count;
	}
	
//	public int getCount(){
//		return count;
//	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getNumberSecu() {
		return numberSecu;
	}

	public void setNumberSecu(int numberSecu) {
		this.numberSecu = numberSecu;
	}

	private void move() {
		
	}
	
	private void manger() {
		
	}
	
	private void work() {
		
	}
	
	private String getFullName() {
		return null;
	}

	


}