
public class AnimalFactory {
	
	private static AnimalFactory instance = new AnimalFactory();
	
	private AnimalFactory() {//instructions chaque fois new AnimalFactory s'execute
		System.out.println("l'unsine vient d'être montée");
	}
	
	public static AnimalFactory getInstance() {
		return instance;
	}
	
	public Animal obtenirUnAnimal(String espece) {
		if (espece == "Chien") {
			return new Chien();
		}else if (espece == "Chat") {
			return new Chat();
		}
		
		return null;
	}

}
