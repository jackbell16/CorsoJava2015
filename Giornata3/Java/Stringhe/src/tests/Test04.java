package tests;

import java.util.ArrayList;

import utils.Interprete;
import utils.InterpreteFile;
import utils.LetturaFile;
import utils.Persona;

/**
 * Questo test mostra l'utilizzo dell'Interprete per convertire un file, in
 * oggetti di tipo {@link Persona}
 * 
 * @author giacomobellazzi
 *
 */
public class Test04 {
	public static void main(String[] args) {
		LetturaFile file = new LetturaFile();
		file.caricaFile("Persone.txt");
		Interprete interprete = new InterpreteFile();
		ArrayList<Persona> persone = interprete.interpreta(file.getRisultato());
		for (Persona persona : persone) {
			System.out.println(persona);
		}
	}

}
