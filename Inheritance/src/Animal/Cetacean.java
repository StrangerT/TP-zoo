package Animal;

public class Cetacean extends Mammal{
	private int fin;
	
	public Cetacean() {
	}
	
	public Cetacean(int f) {
		this.fin = f;
	}
	
	public Cetacean(int f, boolean keratin, boolean collagen){
		super(keratin, collagen);
		this.fin = f;
	}
	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public void liveInWater() {
		System.out.println("Vivre dans l'eau");
	}

}
