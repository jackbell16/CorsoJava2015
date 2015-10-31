package grafica;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import modello.Saluto;

public class View extends JPanel implements Observer {

	private JTextArea area = new JTextArea();
	private Saluto saluto;

	public View(Saluto saluto) {
		super();
		this.saluto = saluto;
		saluto.addObserver(this);
		setLayout(new GridLayout(1, 1));
		add(area);
		area.setEditable(false);
	}

	@Override
	public void update(Observable o, Object arg) {
		area.setText(saluto.saluta());

	}

}
