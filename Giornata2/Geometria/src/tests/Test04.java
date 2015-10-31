package tests;

import utils.Cerchio;

/**
 * Questo programma testa il funzionamento per il calcolo dell'area e perimetro
 * di un {@link Cerchio}
 * 
 * @author giacomobellazzi
 *
 */
public class Test04 {
	public static void main(String[] args) {
		Cerchio Cerchio = new Cerchio(3.0);
		System.out.println("L'area del cerchio vale "+Cerchio.calcolaArea());
		System.out.println("Il perimetro del cerchio vale "+Cerchio.calcolaPerimetro());
	}

}
