package fakultet;

public class Main {

	public static void main(String[] args) {
		Profesor p1=new Profesor("Nikoa","Stojanovic",1998,"Doktor");
		p1.addPredmet("Matematika");
		p1.addPredmet("Fizika");
		System.out.println(p1.ispis());
		
		Profesor p2=new Profesor("Milan","Jaksic",1980,"Magistar");
		p2.addPredmet("Likovno");
		p2.addPredmet("Muzicko");
		System.out.println(p2.ispis());
		
		Profesor p3=new Profesor("Jelena","Obradovic",1988,"Magistar");
		p3.addPredmet("Bleja");
		p3.addPredmet("Na casu");
		System.out.println(p3.ispis());
		
		Student s1= new Student ("Nikolina","Nikolic",1995,"00250/16",3,9.56 );
		Student s2= new Student ("Aleksandra","Nikolic",1993,"00250/14",5,9.96 );
		System.out.println(s1.ispis());
		System.out.println(s2.ispis());

		

		
	}

}
