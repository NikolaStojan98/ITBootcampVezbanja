package kalkulator;

public class Calculator {
	public double c=0;

	public Calculator add(double d) {
			c+=d;
			return this;
	}





	public double value() {
		return c;
	}

	public  Calculator mul(double d) {
		c*=d;

		return this;
	}

	public Calculator div(double i) {
		c/=i;

		return this;
	}


	public Calculator sub(double i) {
		c-=i;
		return this;
	}


}
