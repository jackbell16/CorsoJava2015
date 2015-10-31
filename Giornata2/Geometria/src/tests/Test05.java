package tests;

import utils.Rettangolo;

/**
 * Questo programma testa il funzionamento per il calcolo dell'area e perimetro
 * di un {@link rettangolo}
 * 
 * @author giacomobellazzi
 *
 */
public class Test05 {
	public static void main(String[] args) {
		Rettangolo rettangolo = new Rettangolo(2.0, 4.0);
		System.out.println("L'area del rettangolo vale " + rettangolo.calcolaArea());
		System.out.println("Il perimetro del rettangolo vale " + rettangolo.calcolaPerimetro());
	}

}
