package tests;

import javax.swing.JFrame;

import grafica.PannelloSaluto;

public class Test02 {
	public static void main(String[] args) {
		PannelloSaluto pannelloSaluto = new PannelloSaluto();
		JFrame frame = new JFrame("Salutami");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.getContentPane().add(pannelloSaluto);
		frame.setVisible(true);
	}

}
