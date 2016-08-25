
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		
		AnimalFactory singleton = AnimalFactory.getInstance();
		Animal garfield = singleton.obtenirUnAnimal("Chat");
		
		garfield.Crier();
	}
}

