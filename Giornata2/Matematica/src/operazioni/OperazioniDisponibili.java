package operazioni;

import java.util.ArrayList;

/**
 * Questa classe contiene tutte le operazioni disponibili
 * 
 * @author giacomobellazzi
 *
 */
public class OperazioniDisponibili {

	private ArrayList<Operazione> operazioni = new ArrayList<>();
	public static OperazioniDisponibili disponibili = new OperazioniDisponibili();

	private OperazioniDisponibili() {
		caricaOperazioni();
	}

	private void caricaOperazioni() {
		operazioni.add(new Somma());
		operazioni.add(new Sottrazione());
		operazioni.add(new Moltiplicazione());
		operazioni.add(new Divisione());

	}

	public ArrayList<Operazione> getOperazioni() {
		return operazioni;
	}

	public void setOperazioni(ArrayList<Operazione> operazioni) {
		this.operazioni = operazioni;
	}

}
