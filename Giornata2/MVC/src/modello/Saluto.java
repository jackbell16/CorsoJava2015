package modello;

import java.util.Observable;

public class Saluto extends Observable {

	private String nome;

	public Saluto(String nome) {
		super();
		this.nome = nome;
	}

	public Saluto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String saluta() {
		return "Ciao " + nome + "!";
	}

	public void update() {
		setChanged();
		notifyObservers();
	}

}
