package operazioni;

public class Massimo implements Operazione {
	
	private String risultato;
	
	@Override
	public void calcola(int a, int b) {
		risultato = "Il numero maggiore è :"+Math.max(a, b);
		
	}
	
	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString(){
		return "Massimo";
	}

}
