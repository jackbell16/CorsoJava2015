package operazioni;

public interface Operazione {
	/**
	 * Metodo che permette di calcolare il risultato
	 * @param a
	 * @param b
	 */
	public void calcola(int a, int b);
	/**
	 * Metodo che permettte di ottenere il risultato
	 * @return
	 */
	public String mostraRisultato();

}
