package operazioni;

public class Moltiplicazione implements Operazione {
	
	private String risultato;

	@Override
	public void calcola(int a, int b) {
		double prodotto = a*b;
		risultato = "Il prodotto vale: "+prodotto;

	}

	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString() {
		return "Moltiplicazione";
	}

}
