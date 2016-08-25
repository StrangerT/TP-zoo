package Animal;

public class Gasteropod extends Mollusc{
	
	private String shellShape;
	
	public Gasteropod() {
	}
	
	public Gasteropod(String ss) {
		this.shellShape = ss;
	}
	
	public Gasteropod(String ss, boolean radula, boolean collagen){
		super(radula, collagen);
		this.shellShape = ss;
	}

	public String getShellShape() {
		return shellShape;
	}

	public void setShellShape(String shellShape) {
		this.shellShape = shellShape;
	}

	public void crawl() {
		System.out.println("Ramper");
	}
	
	
	

}
