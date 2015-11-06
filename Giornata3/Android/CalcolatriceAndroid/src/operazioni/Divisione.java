package operazioni;

public class Divisione implements Operazione{
	
	private String risultato;
	
	@Override
	public void calcola(int a, int b) {
		if(b!=0){
		int quoziente = a/b;
		int resto = a%b;
		risultato = "La divisione tra "+a+" e "+b+" ritorna: q="+quoziente+" r="+resto;
		}else{
			risultato = "Errore: non puoi dividere per 0 !";
		}
		
	}
	
	@Override
	public String mostraRisultato() {
		return risultato;
	}
	
	@Override
	public String toString(){
		return "Divisione";
	}

}
