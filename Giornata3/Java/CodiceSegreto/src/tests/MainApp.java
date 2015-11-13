package tests;

import javax.swing.JFrame;

import grafica.PannelloGioco;

public class MainApp {
	public static void main(String[] args) {
		PannelloGioco gioco = new PannelloGioco();
		JFrame frame = new JFrame("CodiceSegreto");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(gioco);
		frame.setSize(700, 700);
		frame.setVisible(true);
	}

}
