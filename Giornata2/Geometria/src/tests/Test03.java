package tests;

import utils.Quadrato;
/**
 * Questo programma testa il funzionamento per il calcolo dell'area e perimetro
 * di un {@link Quadrato}
 * @author giacomobellazzi
 *
 */
public class Test03 {
	public static void main(String[] args) {
		Quadrato quadrato = new Quadrato(2.0);
		System.out.println("L'area del quadrato vale "+quadrato.calcolaArea());
		System.out.println("Il perimetro del quadrato vale "+quadrato.calcolaPerimetro());
	}

}
