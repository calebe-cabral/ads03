public class Primo {
	public static void main(String[] args) {

		long cont = 0;
		for (long n = 2; n <= 50; n++) {
			boolean ePrimo = true;
			double limite = Math.sqrt(n);
			long i = 2;
			while (i <= limite && ePrimo) {
				if (n % i == 0) {
					ePrimo = false;
				}
				i++;
			}
			if (ePrimo) {
				System.out.printf("%d, ", n);
				cont++;
				if (cont%10 == 0)
					System.out.println("");
			}
		}
	}
}