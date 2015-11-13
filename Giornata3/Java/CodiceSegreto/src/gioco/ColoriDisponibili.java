package gioco;

import java.awt.Color;
import java.util.HashMap;

public class ColoriDisponibili {

	private HashMap<Color, String> colori = new HashMap<>();
	public static ColoriDisponibili disponibili = new ColoriDisponibili();

	private ColoriDisponibili() {
		caricaColori();
	}

	public HashMap<Color, String> getColori() {
		return colori;
	}

	public void setColori(HashMap<Color, String> colori) {
		this.colori = colori;
	}

	private void caricaColori() {
		colori.put(Color.BLACK, "NERO");
		colori.put(Color.BLUE, "BLUE");
		colori.put(Color.GREEN, "VERDE");
		colori.put(Color.YELLOW, "GIALLO");
		colori.put(Color.RED, "ROSSO");
		colori.put(Color.ORANGE, "ARANCIONE");
		colori.put(Color.MAGENTA, "MAGENTA");
		colori.put(Color.PINK, "ROSA");
		colori.put(Color.WHITE, "BIANCO");

	}

}
