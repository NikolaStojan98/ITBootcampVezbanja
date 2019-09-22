package domaci_08162019;

import java.lang.Math;

public class Zadatak_2_08162019 {

	public static void main(String[] args) {
		int i, sum = 0;
		for (i = 1; i <= 5; i++) {
			if (i < 5 && Math.random() > 0.5)
				sum += 1;
			else if (i == 5 && Math.random() > 0.5)
				sum += 2;
		}

		System.out.println("Broj poena je " + sum);

	}

}
