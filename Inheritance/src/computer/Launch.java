package computer;
import java.util.ArrayList;

import computer.Mac;
import computer.Windows;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Windows w = new Windows("clavier Windows");
		//w.sayHello();
		w.bug();
		System.out.println(w.getKeyboard());
//		Mac c = new Mac();
//		c.sayHello();
//		c.cost();
		ArrayList<Computer> computers = new ArrayList<Computer>();
		computers.add(new Windows());
		computers.add(new Mac());
		
		for(Computer c : computers){
			c.sayHello();
		}
	}

}
