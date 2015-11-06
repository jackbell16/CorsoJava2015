package utils;

public class Persona {

	private String nome;
	private String cognome;
	private Data data;

	public Persona(String nome, String cognome, Data data) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return nome + " " + cognome + " " + data;
	}

}
