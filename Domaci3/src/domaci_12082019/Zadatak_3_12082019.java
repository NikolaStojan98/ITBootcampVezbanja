package domaci_12082019;
import java.util.Scanner;


public class Zadatak_3_12082019 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0, sum=0;
	while (a>=0)
	{
		System.out.print("Unesite broj: ");
		a=sc.nextInt();
		if(a>0)
		sum+=a;
		
	}
	System.out.println("Suma je "+sum);
	}

}
