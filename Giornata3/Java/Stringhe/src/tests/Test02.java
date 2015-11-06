package tests;
/**
 * Questo test mostra un po' dei metodi presenti nelle librerie Java, per poter
 * gestire e modificare le stringhe
 * @author giacomobellazzi
 *
 */
public class Test02 {
	public static void main(String[] args) {
		String string = "Questa è una stringa";
		System.out.println(string);
		System.out.println(string.substring(0, 6));
		System.out.println(string);
		System.out.println(string.length());
		System.out.println(string.contains("è"));
		System.out.println(string.charAt(10));
		System.out.println(string.startsWith("questa"));
		System.out.println(string.startsWith("Questa"));
		System.out.println(string.endsWith("stringa"));
		System.out.println(string.replaceAll("è", "e'"));
		System.out.println(string);
		System.out.println(string.toLowerCase());
		System.out.println(string.toUpperCase());
		String casa = "Casa";
		System.out.println(casa.equalsIgnoreCase("casa"));
	}

}
