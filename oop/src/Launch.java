
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Person p = new Person();
		System.out.println(p.getSex() + " " + p.getNumberSecu());
		
		Person q = new Person("Nike");
		System.out.println(q.getFirstName() + " " + q.getNumberSecu());
		
		Person r = new Person("White", "Walter");
		System.out.println(r.getLastName() + " " + r.getNumberSecu());
		System.out.println(p.getSex() + " " + p.getNumberSecu());
		System.out.println(Person.getCount());*/
		
		
//		Car b = new Car("bleu", 4);
//		b.setColor("blue");
//		b.setWheelNb(4);
//		System.out.println(b.getColor());
//		b.move();
//		
//		Car r = new Car();
//		r.setColor("red");
//		r.setWheelNb(6);
//		System.out.println(r.getWheelNb());
//		
//		//System.out.println(Car.getCount());
//		
//		System.out.println(b.getCount());
//		
//		House myHouse = new House(5, "Ardoise", 10);
//		myHouse.controlDigicode(1234);
		
		//Mammal m = new Mammal();
		
		//Scooter s = new Scooter("black");
		Person joe = new Person();
//		//joe.setMyScooter(s);
		joe.buyScooter("black");
		joe.getScooters().get(0).accelerate();
		joe.getScooters().get(0).drive();
		//s.deccelerate();
		joe.getScooters().get(0).stop();
		System.out.println(joe.getScooters().get(0).getColor());
		joe.buyScooter("red");
		System.out.println(joe.getScooters().get(1).getColor());
		System.out.println(joe.getScooters().size());
		joe.getScooters().remove(0);//index 0 deleted
		System.out.println(joe.getScooters().get(0).getColor());//index 1 remplace la place de index 0
		
		//joe.getScooters().clear();//vider la liste
		/*for(Scooter s : joe.getScooters()){
			joe.getScooters().remove(s);
		}*/
		System.out.println(joe.getScooters().get(0).getColor());
		
		Person kate = new Person("Madame", "Kate");
		kate.getMyHouse().moreCat("white");
		System.out.println(kate.getMyHouse().getCats().get(0).getColor());
		
		
	}

}
