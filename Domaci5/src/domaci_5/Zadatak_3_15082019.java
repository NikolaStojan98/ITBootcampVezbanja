package domaci_5;

import java.util.Scanner;

public class Zadatak_3_15082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti m i n ");
		int m=sc.nextInt(), n=sc.nextInt();
		for (int a=1;a<=n;a++) {
			for (int b=1; b<=m;b++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
