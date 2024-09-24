package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int [] tabell1 = {42, 67, 89};
		int [] tabell2 = {15, 23, 42, 88};
		
		System.out.print("Utskrift av tabell1:");
		skrivUt(tabell1);
		System.out.println();
		
		System.out.println("tilStreng for tabell1:" + tilStreng(tabell1));
		
	} 

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[");
		for (int i = 0; i < tabell.length; i ++) {
			System.out.print(tabell[i] + " ");
		}
		
		System.out.print("]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String result = "[";
		
		for (int i = 0; i < tabell.length; i++) {
			result += tabell[i];
			if (i < tabell.length - 1) {
				result += ",";
			}
		}
		
		result += "]";
		return result;
	}

	// c)
	public static int summer(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		// TODO
		throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
	}

	// f)
	public static int[] reverser(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden reverser ikke implementert");
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		// TODO
		throw new UnsupportedOperationException("Metoden erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
