import java.util.Arrays;

public class SearchArray {

	public static void main(String[] args) {
		int[] a = { 5, 7, 9, 3, 1 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("ordem = " + a[i]);
		}

		System.out.println(Arrays.binarySearch(a, 5) + " ");
	}

}