import java.util.Scanner;

public class Vetor04 {
	
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		int i = 0;

		while (i < 10) {
			System.out.println("Digite o " + (i + 1) + "");
			vetor[i] = entrada.nextInt();
			i++;
		}
		System.out.println(vetor[i]);

	}
}
