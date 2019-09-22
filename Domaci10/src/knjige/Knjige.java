package knjige;

public class Knjige {
private String nazivKnjige;
private String autor;
private String godIzdanja;
private String brStrana; // moglo je i int, ali ne menja preterano stvarn, stim sto u GP ne bismo morali pod navodnicima da unosimo


public Knjige(String nazivKnjige, String autor, String brStrana) {
	this.nazivKnjige=nazivKnjige;
	this.autor=autor;
	this.brStrana=brStrana;
	
}

public String getNazivKnjige() {
	return nazivKnjige;
}

public String getAutor() {
	return autor;
}

public String getBrStrana() {
	return brStrana;
}

public String getGodIzdanja() {
	return godIzdanja;
}

public void setGodIzdanja(String godIzdanja) {
	this.godIzdanja=godIzdanja;
}


}
