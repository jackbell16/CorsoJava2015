package grafica;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import gioco.Buchi;
import gioco.ColoriDisponibili;

public class PannelloGioco extends JPanel {

	private ArrayList<JComboBox<Object>> boxes = new ArrayList<>();
	private ArrayList<Integer> numeri = new ArrayList<>();
	private JButton button = new JButton("Verifica");
	private JTextArea area = new JTextArea();
	private JPanel panelBox = new JPanel();
	private JLabel label = new JLabel("Numero tentativi: ");
	private int tentativi;
	private Buchi codice = new Buchi();

	public PannelloGioco() {
		generaCodice();
		creaBox();
		creaGrafica();
		controlla();
	}

	private void creaGrafica() {
		panelBox.setLayout(new GridLayout(1, 4));
		for (JComboBox<Object> jComboBox : boxes) {
			panelBox.add(jComboBox);
		}
		setLayout(new GridLayout(4, 1));
		add(panelBox);
		add(label);
		add(button);
		add(area);

	}

	private void creaBox() {
		for (int i = 0; i < 4; i++) {
			JComboBox box = new JComboBox<>(ColoriDisponibili.disponibili.getColori().keySet().toArray());
			box.setRenderer(new ColorRender());
			box.setOpaque(true);
			boxes.add(box);
		}
	}

	private void generaCodice() {
		Object[] colori = ColoriDisponibili.disponibili.getColori().keySet().toArray();
		for (int i = 0; i < 4; i++) {
			int indice = ThreadLocalRandom.current().nextInt(0, colori.length);
			codice.aggiungiNumero((Color) colori[indice]);
		}
	}

	private void controlla() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color a = (Color) boxes.get(0).getSelectedItem();
				Color b = (Color) boxes.get(1).getSelectedItem();
				Color c = (Color) boxes.get(2).getSelectedItem();
				Color d = (Color) boxes.get(3).getSelectedItem();
				String testo = codice.verifica(a, b, c, d);
				area.setText(testo);
				tentativi++;
				label.setText("Tenativi :" + tentativi);
			}
		});
	}

}
