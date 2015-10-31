package operazioni;

import java.util.Observable;

public class ProxyOperazione extends Observable implements Operazione {

	private Operazione operazione;

	public ProxyOperazione(Operazione operazione) {
		super();
		this.operazione = operazione;
	}

	public Operazione getOperazione() {
		return operazione;
	}

	public void setOperazione(Operazione operazione) {
		this.operazione = operazione;
	}

	@Override
	public void calcola(int a, int b) {
		operazione.calcola(a, b);

	}

	@Override
	public String mostraRisultato() {
		return operazione.mostraRisultato();
	}

	public void update() {
		setChanged();
		notifyObservers();
	}

}
