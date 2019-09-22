package domaci_2_09082019;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite ime figure ciju povrsinu zelite izracunati (pravougaonik, krug, kvadrat)");
		String s;
		s=sc.nextLine();
		switch (s)
		{
		case "pravougaonik":
			System.out.println("Unesite stranicu a:");
			double a= sc.nextDouble();
			System.out.println("Unesite stranicu b:");
			double b= sc.nextDouble();
			double pk= a*b;
			System.out.println("Povrsina pravougaonika je "+ pk);
			break;
		case "krug":
			System.out.println("Unesite poluprecnik r:");
			double r= sc.nextDouble();
			double pkr= r*r*3.14;
			System.out.println("Povrsina kruga je "+ pkr);
			break;
		case "kvadrat":
			System.out.println("Unesite stranicu kvarata c:");
			double c= sc.nextDouble();
			double pkv= c*c;
			System.out.println("Povrsina kvadrata je "+ pkv);
			break;
		default: 
			System.out.println("Pogresno ste uneli ime figure");
		
		
		}
	}

}
