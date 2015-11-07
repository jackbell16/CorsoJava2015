package tests;

import java.util.ArrayList;

public class Materia {

	private ArrayList<Double> voti = new ArrayList<>();
	private String nome;

	public Materia(String nome) {
		super();
		this.nome = nome;
	}

	// Questo metodo permette di aggiungere un voto alla materia
	public void aggiungiVoto(double voto) {
		voti.add(voto);
	}

	// Questo metodo calcola la media aritmetica dei voti
	public void mostraMedia() {
		double media = 0;
		double somma = 0;
		for (Double voto : voti) {
			somma += voto;
		}
		media = somma / voti.size();
		System.out.println(nome + " media=" + media);
	}

	@Override
	public String toString() {
		return "Materia: " + nome;
	}

	public ArrayList<Double> getVoti() {
		return voti;
	}

	public void setVoti(ArrayList<Double> voti) {
		this.voti = voti;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
