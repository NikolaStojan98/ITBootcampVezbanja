package ucionica;

public class Main {

	public static void main(String[] args) {
		Polaznik p1=new Polaznik("Nikola","Stojanovic");
		Laptop l1=new Laptop (p1,"Asus");
		Polaznik p2=new Polaznik("Pera","Petrovic");
		Laptop l2=new Laptop (p2,"Asus");
		l2.setPolaznik(null);
		System.out.println(l1.ispis());
		System.out.println(l2.ispis());
		
		
	}

}
