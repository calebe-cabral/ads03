import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int[] intervalos = new int[11];
		int[] notas = new int[20];
		Scanner entrada = new Scanner(System.in);
		int alunos = 1;

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a nota do " + alunos + "°aluno:");
			notas[i] = entrada.nextInt();
			alunos++;
		}
		for (int i = 0; i < notas.length; i++) {
			intervalos[notas[i] / 10]++;
		}
		for (int i = 0; i < intervalos.length - 1; i++) {
			System.out.printf("%02d-%02d : %d\n", 10 * i, (10 * i + 9), intervalos[i]);
		}
		System.out.printf("   100 : %d\n", intervalos[10]);
	}

}