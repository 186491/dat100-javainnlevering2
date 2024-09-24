package no.hvl.dat100.tabeller;

public class Tabeller {

	public static void main(String[] args) {
		int [] tabell1 = {42, 67, 89};
		int [] tabell2 = {17, 12, 88, 44};
		
		//a)
		System.out.print("Utskrift av tabell1:");
		skrivUt(tabell1);
		System.out.println();
		//b)
		System.out.println("tilStreng for tabell1:" + tilStreng(tabell1));
		//c
		System.out.println("Summen av tabell1:" + summer(tabell1));
		//d)
		System.out.println("Finnes 89 i tabell1? " + finnesTall(tabell1, 89));
		System.out.println("Finnes 1 i tabell1? " + finnesTall(tabell1, 1));
		//e)
		System.out.println();
		//f)
		System.out.println("Reversert tabell1:" + tilStreng(reverser(tabell1)));
		//g)
		System.out.println("Er tabell1 sortert? " + erSortert(tabell1));
		System.out.println("Er tabell2 sortert? " + erSortert(tabell2));
		//h)
		System.out.println();
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

		int sum = 0;
		for (int tall: tabell) {
			sum += tall;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		if (tabell != null) {
			for (int t: tabell) {
				if (t == tall) {
					return true;
				}
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		if (tabell != null) {
			return tall;
		} else {
			return -1;
		}
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int [] reversert = new int[tabell.length];
		for (int i = 0; i < tabell.length; i++) {
			reversert[i] = tabell[tabell.length -1 -i];
		}
		return reversert;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 1; i < tabell.length; i++) {
			if(tabell [i] < tabell[i - 1]) {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("Metoden settSammen ikke implementert");

	}
}
