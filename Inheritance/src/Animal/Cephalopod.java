package Animal;

public class Cephalopod extends Mollusc{
	private int nbMember;
	public Cephalopod() {
	}
	
	public Cephalopod(int nm) {
		this.nbMember = nm;
	}
	
	public Cephalopod(int nm, boolean radula, boolean collagen){
		super(radula, collagen);
		this.nbMember = nm;
	}

	public int getNbMember() {
		return nbMember;
	}

	public void setNbMember(int nbMember) {
		this.nbMember = nbMember;
	}
	
	public void sneak() {
		System.out.println("Camoufler");
	}

}
