package tests;

import java.util.ArrayList;

public class Libretto {

	private ArrayList<Materia> materie = new ArrayList<>();
	// Questo metodo permette di aggiungere una materia al proprio libretto
	public void aggiungiMateria(Materia materia) {
		materie.add(materia);
	}
	// Questo metodo permette di mostrare a video la media di tutte le materie presenti nel libretto
	public void mostraMediaLibretto() {
		for (Materia materia : materie) {
			materia.mostraMedia();
		}
	}
	public ArrayList<Materia> getMaterie() {
		return materie;
	}
	public void setMaterie(ArrayList<Materia> materie) {
		this.materie = materie;
	}
	
	

}
