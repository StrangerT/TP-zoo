
public class Cat {
	private String color;
	private int nbCat;
	private static int count = 0;
	
	public Cat(){
		nbCat = ++count;
	}
	
	public Cat(String clr) {
		this();
		this.color = clr;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNbCat() {
		return nbCat;
	}

	public void setNbCat(int nbCat) {
		this.nbCat = nbCat;
	}

}
