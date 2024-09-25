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
		
		//d)
		
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
			result += " \\n";
		}
		return result;
	}
//	noe er feil i JUnit test "Error: expected <123  456  789> but was <1 2 3 \n4 5 6 \n7 8 9 \n> skal se på det senere

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("Metoden skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden erLik ikke implementert");
		
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
