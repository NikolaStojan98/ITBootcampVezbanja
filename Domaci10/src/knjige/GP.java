package knjige;

public class GP {

	public static void main(String[] args) {
		Knjige a1=new Knjige("Vrlo","Nikola S", "500");
		a1.setGodIzdanja("2012");
		Knjige a2=new Knjige("Lagan0","Nikola S", "600");
		a2.setGodIzdanja("2013");
		Knjige a3=new Knjige("Buraz","Nikola S", "700");
		a3.setGodIzdanja("2014");
		
		System.out.println(a1.getNazivKnjige()+" "+a1.getAutor()+" "+a1.getBrStrana()+" "+a1.getGodIzdanja());
		System.out.println(a2.getNazivKnjige()+" "+a2.getAutor()+" "+a2.getBrStrana()+" "+a2.getGodIzdanja());
		System.out.println(a3.getNazivKnjige()+" "+a3.getAutor()+" "+a3.getBrStrana()+" "+a3.getGodIzdanja());
		
		
		
		
		
		
		
		
	}

}
