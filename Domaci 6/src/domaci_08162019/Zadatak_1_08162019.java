package domaci_08162019;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, n;
		System.out.println("Unesi broj redova ");
		n = sc.nextInt();
		for (i = 0; i <= n; i++) {
			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}

		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j <= n - i; j++)
				System.out.print(" ");
			for (j = 1; j <= 2 * i - 1; j++)
				System.out.print("*");
			System.out.println();
		}

	}

}
