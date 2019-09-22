package poljoprivreda;

public class Suma extends Parcela {
	private double povrsStabla;
	private double prinosStabla;
	private int period;

	public Suma(double povrsina, double povrsStabla, double prinosStabla, int period) {
		super(povrsina);
		this.povrsStabla = povrsStabla;
		this.prinosStabla = prinosStabla;
		this.period = period;
	}
	
	
	
	@Override
	public double getPrinos(double godine) {
		return getPovrsina() / povrsStabla * prinosStabla * (godine / period);

	}

	@Override
	public char getVrsta() {
		return 'S';
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(":(").append(povrsStabla).append(',').append(prinosStabla).append(',').append(period).append(')');

		return super.toString() + sb.toString();

	}



}
