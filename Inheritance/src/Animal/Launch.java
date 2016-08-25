package Animal;

import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		
		Cetacean whale = new Cetacean(2);
		System.out.println(whale.getFin());
		
		Gasteropod escargot = new Gasteropod("Spiral", true, true);
		escargot.crawl();
		
		System.out.println(escargot.toString());
		System.out.println(whale.toString());
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

	}

}
