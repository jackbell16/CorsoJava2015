package operazioni;

public class Sottrazione implements Operazione{
	
	private String risultato;
	
	@Override
	public void calcola(int a, int b) {
		int differenza = a-b;
		risultato = "La differenza tra "+a+" e "+b+" vale "+differenza;
		
	}
	
	@Override
	public String mostraRisultato() {
		return risultato;
	}

	@Override
	public String toString(){
		return "Sottrazione";
	}
	
}
