package domaci_13082019;

import java.util.Scanner;

public class Zadatak_3_13082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 1, sum1 = 0;
		while (a <= 5) {
			sum1 += a;
			
			a += 1;

		}
		System.out.println("Suma prvih 5 brojeva je " + sum1);

		System.out.println("Unesi n");
		int n = sc.nextInt();
		int sum2 = 0, b = 1;
		while (b <= n) {
			sum2 += b;
			b += 1;

		}
		System.out.println("Suma brojeva do n je " + sum2);

		System.out.println("Unesi k");
		int k = sc.nextInt();
		int sum3 = 0;
		while (k <= n) {
			sum3 += k;
			k += 1;
		}
		System.out.println("Suma brojeva od k do n je " + sum3);
	}

}
