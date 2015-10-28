package grafica;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PannelloSaluto extends JPanel{
	
	private JLabel label = new JLabel("Inserisci il tuo nome");
	private JTextField field = new JTextField();
	private JButton button = new JButton("Salutami");
	private JTextArea area = new JTextArea();
	
	public PannelloSaluto() {
		setLayout(new GridLayout(4, 1));
		add(label);
		add(field);
		add(button);
		add(area);
		saluta();
	}
	
	private void saluta(){
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = field.getText();
				area.setText("Ciao "+nome+"!");
				
			}
		});
	}

}
