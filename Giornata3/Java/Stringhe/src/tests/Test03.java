package tests;

import java.util.StringTokenizer;

import utils.Data;
import utils.Persona;

/**
 * Questo test permette di convertire una stringa in un oggetto {@link Persona}
 * 
 * @author giacomobellazzi
 *
 */
public class Test03 {
	public static void main(String[] args) {
		String testo = "Paolo|Rossi|10|10|1994";
		StringTokenizer tokenizer = new StringTokenizer(testo, "|");
		String nome = tokenizer.nextToken();
		String cognome = tokenizer.nextToken();
		int giorno = Integer.valueOf(tokenizer.nextToken());
		int mese = Integer.valueOf(tokenizer.nextToken());
		int anno = Integer.valueOf(tokenizer.nextToken());
		// System.out.println(nome + " " + cognome + " " + giorno + "/" + mese +
		// "/" + anno);
		Persona persona = new Persona(nome, cognome, new Data(giorno, mese, anno));
		System.out.println(persona);
	}

}
