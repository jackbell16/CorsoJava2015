package gioco;

import java.awt.Color;
import java.util.ArrayList;

public class Buchi {
	
	private ArrayList<Color> numeri = new ArrayList<>();
	
	public void aggiungiNumero(Color color){
		numeri.add(color);
	}
	
	public Buchi(Color...colors) {
		numeri.clear();
		for (int i = 0; i < colors.length; i++) {
			numeri.add(colors[i]);
		}
	}
	
	public Buchi() {
		// TODO Auto-generated constructor stub
	}
	
	public void impostaNumeri(Color...colors){
		numeri.clear();
		for (int i = 0; i < colors.length; i++) {
			numeri.add(colors[i]);
		}
	}
	
	public void pulisci(){
		numeri.clear();
	}
	
	public String verifica(Color...colors){
		String risultato = "";
		for (int i = 1; i < numeri.size()+1; i++) {
			if(numeri.get(i-1).equals(colors[i-1])){
				risultato += "La casella "+i+" è corretta";
			}else{
				risultato += "La casella "+i+" è sbagliata";
			}
			risultato+="\n";
		}
		return risultato;
	}
}
