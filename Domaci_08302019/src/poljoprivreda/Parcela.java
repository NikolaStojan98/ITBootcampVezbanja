package poljoprivreda;

public abstract class Parcela {
	private int UID = 0;
	private double povrsina;
	private int id;
	

	public Parcela(double povrsina) {
		super();
		this.povrsina = povrsina;
		this.id = UID++;
	}

	

	public double getPovrsina() {
		return povrsina;
	}

	public int getId() {
		return id;
	}

	public abstract double getPrinos(double godine);
	
	public abstract char getVrsta();
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getVrsta()).append('_').append(id).append('[').append(povrsina).append(']');
		return sb.toString();
	}





}
