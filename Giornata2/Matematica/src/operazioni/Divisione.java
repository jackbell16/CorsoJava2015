package operazioni;

public class Divisione implements Operazione {
	
	private String risultato;

	@Override
	public void calcola(int a, int b) {
		double quoziente = a/b;
		double resto = a%b;
		risultato = "Quoziente: "+quoziente+" resto: "+resto;

	}

	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString() {
		return "Divisione";
	}

}
