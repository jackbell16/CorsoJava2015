package tests;

import utils.Data;
import utils.Persona;

public class Test02 {
		public static void main(String[] args) {
			Persona io = new Persona("Giacomo", "ISmanettone", new Data(4, 8, 1992));
			Persona tu = new Persona("Giovanni", "Campus", new Data(13, 9, 1977));
			Persona amico1 = new Persona("Mario", "ISmanettone", new Data(4, 8, 1980));
			Persona amico2 = new Persona("Gianluca", "Campus", new Data(13, 9, 1978));
			System.out.println(io);
			System.out.println(tu);
			System.out.println(amico1);
			System.out.println(amico2);
			System.out.println(tu.getNascita().èBisestile());
			System.out.println(io.getNascita().èBisestile());
			Data oggi = new Data(24, 10, 2015);
			System.out.println(io.calcolaEtà(oggi));
			System.out.println(tu.calcolaEtà(oggi));
			System.out.println(amico1.calcolaEtà(oggi));
			System.out.println(amico2.calcolaEtà(oggi));
		}
}
