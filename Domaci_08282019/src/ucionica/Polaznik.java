package ucionica;

public class Polaznik {
	private String ime;
	private String prezime;
	private int UID=0;
	private int id;
	
	public Polaznik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		id=++UID;
		
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}
	
	public String ispis() {
		return ime+"_"+prezime+"{"+id+"}";
	}

	
	
}
