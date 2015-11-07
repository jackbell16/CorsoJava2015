package tests;

import javax.swing.JFrame;

import grafica.PannelloComandi;

public class MainApp {
	public static void main(String[] args) {
		PannelloComandi pannello = new PannelloComandi();
		JFrame frame = new JFrame("Lampada");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(pannello);
		frame.setSize(600, 600);
		frame.pack();
		frame.setVisible(true);
	}

}
