import java.util.ArrayList;

public class House {
	
	private int nbWall;
	private String roofType;
	private int nbWindow;
	//private String digicode; //digicode n'est pas une propriété de la maison
	private ArrayList<Cat> cats;
	
	public House(){
		nbWall = 4;
		this.cats = new ArrayList<Cat>();
	}
	
	public House(int w, String r, int wd){
		this();
		nbWall = w;
		roofType = r;
		nbWindow = wd;
	}
	
	public ArrayList<Cat> getCats() {
		return cats;
	}

	public void setCats(ArrayList<Cat> cats) {
		this.cats = cats;
	}

	public void moreCat(String clr){
		this.getCats().add(new Cat(clr));
	}
	
//	public void construction() {
//		
//	}
	
	public void controlDigicode(int type) {
		if (type == 1234) {
			System.out.println("Autorisé !"); //autorisation message
			}
	}
	
	

}
