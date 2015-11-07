package scuola;

import tests.Libretto;
import tests.Materia;

public class Test01 {
	public static void main(String[] args) {
		Materia geografia = new Materia("Geografia");
		geografia.aggiungiVoto(7.0);
		geografia.aggiungiVoto(5.0);
		Materia scienze = new Materia("Scienze");
		scienze.aggiungiVoto(10);
		scienze.aggiungiVoto(8);
		scienze.aggiungiVoto(7);
		Materia matematica = new Materia("Matematica");
		matematica.aggiungiVoto(7);
		matematica.aggiungiVoto(7);
		matematica.aggiungiVoto(8);
		Libretto libretto = new Libretto();
		libretto.aggiungiMateria(geografia);
		libretto.aggiungiMateria(scienze);
		libretto.aggiungiMateria(matematica);
		libretto.mostraMediaLibretto();
	}

}
