package domaci_12082019;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0, sum = 0, pro = 1;
		System.out.println("Uneti broj n:");
		int n = sc.nextInt();
		while (a <= n) {
			if (a % 2 == 0) {
				sum += a;
				a += 1;
			} else {
				pro *= a;
				a += 1;
			}
		}
		System.out.println("Suma parnih brojeva je " + sum);
		System.out.println("Proizvod neparnih brojeva je " + pro);
	}

}
