package tests;

import utils.Data;

public class Test01 {
	public static void main(String[] args) {
		Data oggi = new Data(24, 10, 2016);
		System.out.println(oggi.toString());
		System.out.println(oggi.èBisestile());
	}

}
