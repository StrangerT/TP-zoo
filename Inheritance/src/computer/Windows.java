package computer;
public class Windows extends Computer{

	public Windows(){
		
	}
	
	public Windows(String keyboard){
		super(keyboard);
		this.sayHello();
	}
	
	public void bug(){
		System.out.println("Je peut boguer !");
	}
	public void sayHello(){
		System.out.println("windows");
	}
//	@Override
//	public void sayHello(){
//		super.sayHello();
//		System.out.println("Plus précisement je suis un Windows");
//	}
	
}
