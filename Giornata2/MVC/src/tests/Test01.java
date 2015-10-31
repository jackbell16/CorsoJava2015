package tests;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import grafica.Controller;
import grafica.View;
import modello.Saluto;

/**
 * Questo test è un esempio del design pattern MVC, che serve per spezzare il
 * modello {@link Saluto}, dal controller {@link Controller} e dalla view
 * {@link View}
 * 
 * @author giacomobellazzi
 *
 */
public class Test01 {
	public static void main(String[] args) {
		Saluto saluto = new Saluto();
		JPanel pannello = new JPanel();
		pannello.setLayout(new GridLayout(2, 1));
		pannello.add(new Controller(saluto));
		pannello.add(new View(saluto));
		JFrame frame = new JFrame("MVP");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pannello);
		frame.setSize(800, 400);
		frame.setVisible(true);
	}

}
