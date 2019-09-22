package poljoprivreda;

public class Main {

	public static void main(String[] args) {
		Parcela p1=new Suma(150,25,100,10);
		Parcela p2=new Suma(600,40,45,2);
		Parcela p3=new Njiva(1000,2500);
		System.out.println(p1.getPrinos(10));
		/*
		System.out.println(p1.getPrinos(3));
		p2.getPrinos(3);
		p3.getPrinos(3);
		/*
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	*/
		System.out.println(p3.getPrinos(10));
		Parcela[] niz= {p1, p2, p3};
		
		for(Parcela p: niz) {
			p.getPrinos(2);
			System.out.println(p.toString());
		}
		
		
		
		
		
		
		
		
		

	
		

	}

}
