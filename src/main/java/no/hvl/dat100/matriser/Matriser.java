package no.hvl.dat100.matriser;

public class Matriser {

	public static void main (String[] args) {
		
		int [][] matrise1 = {
				{1, 2, 3},
		};
		
		//a)
		Matriser.skrivUt(matrise1);
		//b)
		
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

		// TODO
		throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
		
	}

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
