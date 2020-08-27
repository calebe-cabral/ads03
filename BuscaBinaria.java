import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int num = 0;

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52,
				53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
				79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 };

		System.out.println("Informe o Número a procurar ?");

		num = ler.nextInt();

		System.out.println(busca(array, num));
	}

	private static int busca(int[] array, int chave) {
		return buscaBinaria(array, 0, array.length - 1, chave);
	}

	private static int buscaBinaria(int[] array, int menor, int maior, int chave) {
		int media = (maior + menor) / 2;
		int valorMeio = array[media];

		if (menor > maior)
			return -1;
		else if (valorMeio == chave)
			return media;
		else if (valorMeio < chave)
			return buscaBinaria(array, media + 1, maior, chave);
		else
			return buscaBinaria(array, menor, media - 1, chave);
	}

}