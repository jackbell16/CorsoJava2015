package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import modello.Saluto;

public class Controller extends JPanel {

	private JLabel label = new JLabel("Inserisci il tuo nome:");
	private JButton button = new JButton("Saluta");
	private JTextField field = new JTextField();
	private Saluto saluto;

	public Controller(Saluto saluto) {
		super();
		this.saluto = saluto;
		creaGrafica();
		actionSaluto();
	}

	private void creaGrafica() {
		setLayout(new GridLayout(3, 1));
		add(label);
		add(field);
		add(button);
	}

	private void actionSaluto() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = field.getText();
				saluto.setNome(nome);
				saluto.update();

			}
		});
	}

}
