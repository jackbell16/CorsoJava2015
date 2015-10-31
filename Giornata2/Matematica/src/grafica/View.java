package grafica;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import operazioni.ProxyOperazione;

public class View extends JPanel implements Observer{
	
	private ProxyOperazione operazione;
	private JTextArea area = new JTextArea();
	
	
	public View(ProxyOperazione operazione) {
		super();
		this.operazione = operazione;
		operazione.addObserver(this);
		area.setEditable(false);
		add(area);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		area.setText(operazione.mostraRisultato());
		
	}

}
