package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PannelloPrincipale extends JPanel {

	private JButton dolcetto = new JButton("Dolcetto");
	private JButton scherzetto = new JButton("Scherzetto");

	public PannelloPrincipale() {
		setLayout(new GridLayout(1, 2));
		add(dolcetto);
		add(scherzetto);
		action(dolcetto, "dolcetto.jpg");
		action(scherzetto, "scherzetto.jpg");
	}

	private void action(JButton button, String string) {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(PannelloPrincipale.class.getResource(string));
				JOptionPane.showMessageDialog(null, "Dolcetto o scherzetto", "Halloween", JOptionPane.INFORMATION_MESSAGE, icon);

			}
		});
	}

}
