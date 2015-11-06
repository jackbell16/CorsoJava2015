package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LetturaFile {

	private ArrayList<String> risultato;
	private BufferedReader reader;

	public void caricaFile(String file) {
		try {
			reader = new BufferedReader(new FileReader(new File(file)));
			String riga = reader.readLine();
			risultato = new ArrayList<>();
			while (riga != null) {
				risultato.add(riga);
				riga = reader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Errore durante l'apertura del file !");
		}
	}

	public ArrayList<String> getRisultato() {
		return risultato;
	}

}
