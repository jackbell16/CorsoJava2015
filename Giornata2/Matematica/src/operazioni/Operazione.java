package operazioni;

public interface Operazione {
	/**
	 * Metodo che permette di effettuare calcolo
	 * @param a
	 * @param b
	 */
	public void calcola(int a, int b);
	/**
	 * Metodo che permette di ottener il risultato dell'operazione
	 * @return
	 */
	public String mostraRisultato();
}
