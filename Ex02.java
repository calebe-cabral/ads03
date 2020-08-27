
public class Ex02 {
	private static boolean ePrimo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 0;
		int[] v1, v2;
		v1 = new int[50];
		v2 = new int[v1.length];

		for (int i = 2; i < v2.length; i++) {

			if (ePrimo(i)) {
				v2[n] = i;
				System.out.println(" vetor 2:  " + v2[n]);
			}
		}
		for (int i = 2; i < v1.length; i++) {
			if (ePrimo(i)) {
				System.out.println(" vetor 1:  " + i);
			}
		}
	}
}