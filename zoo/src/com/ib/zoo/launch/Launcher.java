package com.ib.zoo.launch;

import java.util.Random;

import com.ib.zoo.entity.Account;
import com.ib.zoo.entity.CEO;
import com.ib.zoo.entity.Healer;
import com.ib.zoo.entity.Personnel;
import com.ib.zoo.entity.Zoo;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account();
		Zoo z = new Zoo();
		CEO ceo = new CEO("a", "b", z);
		z.setAccount(a);
		z.setCeo(ceo);
		
		ceo.recruit(1, "tonytony", "choppa");
		ceo.recruit(2, "zoro", "R");
		Healer h1 = null;
		if(z.getPersonnels().get(0) instanceof Healer) {
			h1 = (Healer)z.getPersonnels().get(0);
		}
		h1.setSeniority(719);
		h1.setNbYears(1);
		h1.progress();		
		System.out.println(h1.getNbYears());
		ceo.dismiss("tonytony", "choppa");

		System.out.println(h1.getCureChance());
		System.out.println(h1.getSalary());
		System.out.println(z.getPersonnels().get(0).getFirstname());
		a.toString();
		int an = 245;
		int bn = 350;
		double rate =  (0.7 * bn);
		System.out.println((int) (Math.random() * 5 + 8));
		
	}

}
