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
		System.out.println("Posisjonen til 67 i tabbelen er: " + posisjonTall(tabell1, 67));
		//f)
		System.out.println("Reversert tabell1:" + tilStreng(reverser(tabell1)));
		//g)
		System.out.println("Er tabell1 sortert? " + erSortert(tabell1));
		System.out.println("Er tabell2 sortert? " + erSortert(tabell2));
		//h)
		int[] nyTabell = settSammen(tabell1, tabell2);
		for (int i : nyTabell) {
			System.out.print(i + ", ");
		}
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
		
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i + 1; //Slik at tabellen begynner på 1, og ikke 0
			}
		}
		return -1;	
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
		
		int size1 = tabell1.length;
		int size2 = tabell2.length;
		int size3 = size1 + size2;
		
		int [] nyTabell = new int[size3];
		
		for (int i = 0; i < size1; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int i = 0; i < size2; i++) {
			nyTabell[size1 + i] = tabell2[i];
		}
			
		return nyTabell;
		}
}
