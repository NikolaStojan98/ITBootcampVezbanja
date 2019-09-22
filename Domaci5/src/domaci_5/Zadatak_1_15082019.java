package domaci_5;

import java.util.Scanner;

public class Zadatak_1_15082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s;
		do {
			System.out.println("Izaberite broj figure ciju biste povrsinu izracunali ");
			System.out.println("1-Povrsina kvadra");
			System.out.println("2-Povrsina kocke");
			System.out.println("3-Povrsina valjka");
			System.out.println("4-Povrsina lopte");
			System.out.println("0-Izlaz");
			double a, b, r, h, p;
			s = sc.nextInt();
			switch (s) {
			default:
				System.out.println("Los unos. Pokusajte ponovo");
			case 1:
				System.out.println("Unesite a,b i h: ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				h = sc.nextDouble();
				p = 2 * (a * b + a * h + b * h);
				System.out.println("Povrsina je " + p);
				break;
			case 2:
				System.out.println("Unesite stranicu a: ");
				a = sc.nextDouble();
				p = 6 * a * a;
				System.out.println("Povrsina je " + p);
				break;

			case 3:
				System.out.println("Unesite poluprcnik valjka: ");
				r = sc.nextDouble();
				System.out.println("Unesite visinu valjka");
				h = sc.nextDouble();
				p = r * r * 3.14 + 2 * r * 3.14 * h;
				System.out.println("Povrsina je " + p);
				break;
			case 4:
				System.out.println("Unesite poluprecnik lopte: ");
				r = sc.nextDouble();
				p = 4 * r * r * 3.14;
				System.out.println("Povrsina je " + p);
				break;
			case 0:
				System.out.println("Napustili ste kalkulator!");
				break;
			}

		} while (s != 0);

	}

}
