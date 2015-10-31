package operazioni;

public class Sottrazione implements Operazione {
	
	private String risultato;

	@Override
	public void calcola(int a, int b) {
		double sottrazione = a-b;
		risultato = "La differenza vale: "+sottrazione;

	}

	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString() {
		return "Sottrazione";
	}

}
