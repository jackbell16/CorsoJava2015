package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

import operazioni.Operazione;
import operazioni.OperazioniDisponibili;
import operazioni.ProxyOperazione;

@SuppressWarnings("serial")
public class Controller extends JPanel {

	private ProxyOperazione operazione;
	private JTextField parametro1 = new JTextField("Inserisci il primo parametro");
	private JTextField parametro2 = new JTextField("Inserisci il secondo parametro");
	private JButton invio = new JButton("Invio");
	private JComboBox<Object> box = new JComboBox<>(OperazioniDisponibili.disponibili.getOperazioni().toArray());

	public Controller(ProxyOperazione operazione) {
		super();
		this.operazione = operazione;
		creaGrafica();
		invio();
	}

	private void creaGrafica() {
		setLayout(new GridLayout(4, 1));
		add(parametro1);
		add(parametro2);
		add(box);
		add(invio);
	}

	private void invio() {
		invio.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int p1 = Integer.valueOf(parametro1.getText());
				int p2 = Integer.valueOf(parametro2.getText());
				Operazione operazioneScelta = (Operazione) box.getSelectedItem();
				operazione.setOperazione(operazioneScelta);
				operazione.calcola(p1, p2);
				operazione.update();
			}
		});
	}

}
