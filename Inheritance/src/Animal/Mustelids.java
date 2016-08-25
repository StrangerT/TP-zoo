package Animal;

public class Mustelids extends Mammal{
	
	private int analGland;
	
	public Mustelids() {
	}
	
	public Mustelids(int ag) {
		this.analGland = ag;
	}
	
	public Mustelids(int ag, boolean keratin, boolean collagen){
		super(keratin, collagen);
		this.analGland = ag;
	}
	
	public int getAnalGland() {
		return analGland;
	}

	public void setAnalGland(int analGland) {
		this.analGland = analGland;
	}

	public void smellDefense() {
		System.out.println("Puer");
	}

}
