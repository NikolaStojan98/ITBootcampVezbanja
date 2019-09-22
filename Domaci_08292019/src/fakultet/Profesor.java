package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Covek {
	List<String> predmeti;
	private String titula;

	public Profesor(String ime, String prezime, int godRodj, String titula) {
		super(ime, prezime, godRodj);
		this.titula=titula;
		predmeti = new ArrayList<>();
	}

	public void addPredmet(String predmet) {
		predmeti.add(predmet);
	}

	public boolean izbaciPredmet(String predmet) {
		return predmeti.remove(predmet);
	}

	public String getPredmet(String predmet) {
		return predmeti.get(predmeti.indexOf(predmet));
	}

	public String ispis() {
		String s="";
		for(String predmet : predmeti)
			s+=predmet+", ";
		StringBuilder sb= new StringBuilder();
		sb.append(getIme()).append("_").append(getPrezime())
		.append("[").append(getGodRodj()).append("]").append(" je ")
		.append(titula).append(" koji drzi nastavu na: ").append(s);
		return sb.toString();
	}

}
