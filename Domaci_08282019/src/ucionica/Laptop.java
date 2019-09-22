package ucionica;

public class Laptop {
	private Polaznik polaznik;
	private String marka;

	public Laptop(Polaznik polaznik, String marka) {
		super();
		this.polaznik = polaznik;
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void setPolaznik(Polaznik polaznik) {
		this.polaznik = polaznik;
	}

	public String ispis() {
		String s;
		if (polaznik == null) {
			s = "NEMA VOZACA";
		} else {
			s = polaznik.ispis();
		}
		return marka + "{" + s + "}";
	}

}
