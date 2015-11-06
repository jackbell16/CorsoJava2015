package grafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PannelloGioco extends JPanel {

	private ArrayList<JButton> buttons = new ArrayList<>();
	private static int NUMBER = 49;
	private static int FINITO = 10;
	private ArrayList<Color> colori = new ArrayList<>();
	private int indice;
	private long inizio;
	private int volte;

	public PannelloGioco() {
		caricaColori();
		creaButtons(NUMBER);
		setLayout(new GridLayout(7, 7));
		aggiungiButtons();
		azione();
		inizio = System.currentTimeMillis();
		iniziaGioco();

	}

	private void creaButtons(int number) {
		buttons.clear();
		for (int i = 0; i < number; i++) {
			buttons.add(new JButton());
		}
	}

	private void aggiungiButtons() {
		removeAll();
		for (JButton jButton : buttons) {
			add(jButton);
		}
	}

	private void azione() {
		for (JButton jButton : buttons) {
			jButton.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if (volte != FINITO) {
						if (buttons.get(indice) == jButton) {
							volte++;
							giocoColore();

						}
					} else {
						long tempo = System.currentTimeMillis() - inizio;
						int selection = JOptionPane.showConfirmDialog(null, "Hai impiegato " + tempo + " mSec",
								"Finitio", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
						if (selection == JOptionPane.OK_OPTION) {
							iniziaGioco();
						}

					}
				}

			});
		}
	}

	private void giocoColore() {
		indice = ThreadLocalRandom.current().nextInt(0, buttons.size());
		int colore = ThreadLocalRandom.current().nextInt(0, colori.size());
		for (int i = 0; i < buttons.size(); i++) {
			JButton button = buttons.get(i);
			if (i != indice) {
				cambiaColore(button, colori.get(colore));
			} else {
				button.setFont(new Font(Font.SERIF, Font.ITALIC, 35));
				button.setForeground(Color.BLACK);
				button.setText(volte + "");
			}
		}

	}
	//Questo metodo permette di cambiare il colore di un button
	private void cambiaColore(JButton button, Color color) {
		button.setOpaque(true);
		button.setBorder(null);
		button.setBackground(color);
	}
	// Questo metodo contiene la lista di colori che sono presenti nell'applicazione
	private void caricaColori() {
		colori.add(Color.CYAN);
		colori.add(Color.BLUE);
		colori.add(Color.ORANGE);
		colori.add(Color.YELLOW);
		colori.add(Color.RED);
		colori.add(Color.MAGENTA);
	}
	// Questo metodo fa partire il gioco
	private void iniziaGioco() {
		for (JButton jButton : buttons) {
			jButton.setText(null);
		}
		volte = 1;
		inizio = System.currentTimeMillis();
		giocoColore();
	}

}
