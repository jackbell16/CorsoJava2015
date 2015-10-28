package tests;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Test01 {
	public static void main(String[] args) {
		JPanel panel = new JPanel();
		JTextArea area = new JTextArea("Ciao Mondo!");
		panel.add(area);
		JFrame frame = new JFrame("HelloWorld");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
}
