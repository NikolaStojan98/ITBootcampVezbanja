package poljoprivreda;

public class Njiva extends Parcela{
	private double prinosPoKvM;
	



	public Njiva(double povrsina, double prinosPoKvM) {
		super(povrsina);
		this.prinosPoKvM = prinosPoKvM;
	}
	
	public void setPrinosPoKvM(double prinosPoKvM) {
		this.prinosPoKvM = prinosPoKvM;
	}
	
	
	@Override
	public double getPrinos(double godine) {
		
		return getPovrsina()*prinosPoKvM*godine;
	}
	@Override
	public char getVrsta() {
		return 'N';
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(':').append(prinosPoKvM);
		return super.toString()+sb.toString();
		
	}


	

}
