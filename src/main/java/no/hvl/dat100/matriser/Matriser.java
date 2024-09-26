package no.hvl.dat100.matriser;

public class Matriser {

	public static void main (String[] args) {
		
		int [][] matrise1 = {
				{1, 2, 3},
		};
		
		int [][] matrise2 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		//a)
		Matriser.skrivUt(matrise1);
		//b)
		String arrayString = tilStreng(matrise2);
		System.out.println(arrayString);
		//c)
		int tall = 3;
		int [][] skalertMatrise = skaler(tall, matrise1);
		System.out.print("Matrise etter skalering med " + tall + ": ");
		skrivUt(skalertMatrise);
		//d)
		System.out.println("Er matrise1 lik matrise2? " + erLik(matrise1, matrise2));
		//e)
		//f)
		
	}
	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] rad : matrise) {
			for (int tall : rad) {
				System.out.print(tall + " ");
            }
            System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String result = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				result += matrise[i][j];
				if (j < matrise[i].length - 1) {
					result += " ";
				}
			}
			result += " \n";
		}
		return result;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] nyMatrise = new int[matrise.length][matrise[0].length];
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		return nyMatrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if (a.length != b.length || a[0].length != b[0].length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true; 
	}	
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
