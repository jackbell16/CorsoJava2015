package operazioni;

public class Somma implements Operazione {

	private String risultato;

	@Override
	public void calcola(int a, int b) {
		double somma = a + b;
		risultato = "La somma vale: " + somma;

	}

	@Override
	public String mostraRisultato() {
		return risultato;
	}

	@Override
	public String toString() {
		return "Somma";
	}

}
