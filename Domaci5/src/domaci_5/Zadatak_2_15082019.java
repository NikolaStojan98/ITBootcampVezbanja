package domaci_5;

import java.util.Scanner;

public class Zadatak_2_15082019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti do kog n clana ide fibonacijev niz");
		int n=sc.nextInt();
		int i1=0,i2=1,i3;
		System.out.print(i1+" ");
		System.out.print(i2+" ");
		for(int i=1;i<=n-2;i++) {
			i3=i1+i2;
			System.out.print(i3+" ");
			i1=i2;
			i2=i3;
			
			
		}
		
	}

}
