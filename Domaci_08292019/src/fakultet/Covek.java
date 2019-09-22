package fakultet;

public class Covek {
	private String ime;
	private String prezime;
	private int godRodj;
	public Covek(String ime, String prezime, int godRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodj = godRodj;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodRodj() {
		return godRodj;
	}
	
	public String ispis() {
		return ime+"_"+prezime+"{"+godRodj+"}";
	}
	

}
