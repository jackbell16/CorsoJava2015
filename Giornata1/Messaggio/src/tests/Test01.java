package tests;

import utils.Messaggio;

public class Test01 {
	public static void main(String[] args) {
		String variabile = "Vuoi venire da me?";
		Messaggio invito = new Messaggio(variabile);
		System.out.println(invito.getTesto());
		invito.setTesto("Vuoi ancora venire da me?");
		System.out.println(invito.getTesto());
	}
}
