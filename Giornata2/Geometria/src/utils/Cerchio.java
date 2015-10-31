package utils;

public class Cerchio {
	
	private double raggio;

	public Cerchio(double raggio) {
		super();
		this.raggio = raggio;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}
	
	public double calcolaArea(){
		return raggio*raggio*Math.PI;
	}
	
	public double calcolaPerimetro(){
		return 2*Math.PI*raggio;
	}

}
