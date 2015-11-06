package tests;

import java.util.ArrayList;

public class Test01 {
	public static void main(String[] args) {
		// Creo una lista
		ArrayList<String> list = new ArrayList<>();
		// Aggiungo un elemento alla lista
		list.add("Giacomo");
		list.add("Paolo");
		list.add("Luca");
		list.add("Jacopo");
		list.add("Giovanni");
		list.add("Antonio");
		list.add("Marco");
		System.out.println("Nella lista sono presenti " + list.size() + " elementi");
		System.out.println("Ecco gli elementi presenti nella lista:");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
