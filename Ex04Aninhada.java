
public class Ex04Aninhada {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;

		if (b < a || c < a) {// a não é o menor
			if (b < c) {
				int aux = a;
				a = b;
				b = aux;
			} else {
				int aux = a;
				a = c;
				c = aux;
			}
		} // simples
			// menor está em a
		if (c < b) {
			int aux = b;
			b = c;
			c = aux;
		}
	}
}