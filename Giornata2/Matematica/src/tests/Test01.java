package tests;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import grafica.Controller;
import grafica.View;
import operazioni.ProxyOperazione;
import operazioni.Somma;

/**
 * Questo test permette di mandare in esecuzione il {@link JFrame} della
 * calcolatrice
 * 
 * @author giacomobellazzi
 *
 */
public class Test01 {
	public static void main(String[] args) {
		ProxyOperazione operazione = new ProxyOperazione(new Somma());
		JPanel pannello = new JPanel();
		pannello.setLayout(new GridLayout(2, 1));
		pannello.add(new Controller(operazione));
		pannello.add(new View(operazione));
		JFrame frame = new JFrame("Calcolatrice");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pannello);
		frame.setSize(800, 400);
		frame.setVisible(true);
	}

}
