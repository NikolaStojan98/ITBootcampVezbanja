package fakultet;

public class Student extends Covek {
	private String brIndeksa;
	private int godStudija;
	private double prosek;
	public Student(String ime, String prezime, int godRodj, String brIndeksa, int godStudija, double prosek) {
		super(ime, prezime, godRodj);
		this.brIndeksa = brIndeksa;
		this.godStudija = godStudija;
		this.prosek = prosek;
	}
	public String getBrIndeksa() {
		return brIndeksa;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public double getProsek() {
		return prosek;
	}
	
	public String ispis() {
		StringBuilder sb= new StringBuilder();
		sb.append(this.getIme()).append("_").append(getPrezime()).append("[")
		.append(getGodRodj()).append("]").append(" je student ").append(getGodStudija())
		.append(". godine studija sa prosekom ").append(getProsek());
		return sb.toString() ;
		
	}
	
	

}
