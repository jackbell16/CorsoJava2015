package tests;

/**
 * Questo programma calcola la somma dei primi 100 numeri interi
 * 
 * @author giacomobellazzi
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int somma = 0;
		for (int i = 0; i <= 100; i++) {
			somma += i;
		}
		System.out.println("La somma vale " + somma);
	}

}
