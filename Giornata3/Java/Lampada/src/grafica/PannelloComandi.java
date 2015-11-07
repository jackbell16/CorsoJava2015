package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import comunicazione.Connection;

public class PannelloComandi extends JPanel {

	private JLabel label = new JLabel("Inserisci l'IP:");
	private JTextField field = new JTextField();
	private JButton on = new JButton("Accendi", new ImageIcon(PannelloComandi.class.getResource("on.png")));
	private JButton off = new JButton("Spegni", new ImageIcon(PannelloComandi.class.getResource("off.png")));

	public PannelloComandi() {
		setLayout(new GridLayout(2, 2));
		add(label);
		add(field);
		add(on);
		add(off);
		clickComando(on, "on");
		clickComando(off, "off");
	}

	private void clickComando(JButton button, String comando) {
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String ip = field.getText();
				Connection.getConnection().inviaComando(ip, comando);
				System.out.println(button.getText());
			}
		});
	}

}
