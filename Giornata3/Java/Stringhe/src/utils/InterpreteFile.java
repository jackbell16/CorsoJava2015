package utils;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class InterpreteFile implements Interprete {

	public java.util.ArrayList<Persona> interpreta(java.util.ArrayList<String> testo) {
		ArrayList<Persona> risultato = new ArrayList<>();
		for (String string : testo) {
			StringTokenizer tokenizer = new StringTokenizer(string, "|");
			String nome = tokenizer.nextToken();
			String cognome = tokenizer.nextToken();
			int giorno = Integer.valueOf(tokenizer.nextToken());
			int mese = Integer.valueOf(tokenizer.nextToken());
			int anno = Integer.valueOf(tokenizer.nextToken());
			risultato.add(new Persona(nome, cognome, new Data(giorno, mese, anno)));
		}
		return risultato;
	}

}
