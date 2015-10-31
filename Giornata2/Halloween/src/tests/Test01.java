package tests;

import javax.swing.JFrame;

import grafica.PannelloPrincipale;

public class Test01 {
	public static void main(String[] args) {
		PannelloPrincipale principale = new PannelloPrincipale();
		JFrame frame = new JFrame("HelloWorld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.getContentPane().add(principale);
		frame.setVisible(true);
	}

}
