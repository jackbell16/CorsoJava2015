package tests;

import javax.swing.JFrame;

import grafica.PannelloGioco;

public class MainApp {
	public static void main(String[] args) {
		PannelloGioco gioco = new PannelloGioco();
		JFrame frame = new JFrame("Gioco Velocità");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.getContentPane().add(gioco);
		frame.setVisible(true);
	}

}
