package operazioni;

public class Moltiplicazione implements Operazione{
	
	private String risultato;
	
	@Override
	public void calcola(int a, int b) {
		int prodotto = a*b;
		risultato = "Il prodotto tra "+a+" e "+b+" vale "+prodotto;
		
	}
	
	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString(){
		return "Moltiplicazione";
	}

}
