package utils;

public class Quadrato {

	private double lato;

	public Quadrato(double lato) {
		super();
		this.lato = lato;
	}

	public double getLato() {
		return lato;
	}

	public void setLato(double lato) {
		this.lato = lato;
	}

	public double calcolaArea() {
		return lato * lato;
	}

	public double calcolaPerimetro() {
		return 4 * lato;
	}

}
