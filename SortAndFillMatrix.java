import java.util.Scanner;

class SortAndFillMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();

		if (n < 2 || n > 10)
			System.out.println("MATRIX SIZE OUT OF RANGE");
		else {
			int[] a = new int[n];
			System.out.print("ELEMENTS OF SINGLE DIMENSIONAL ARRAY: ");
			for (int i = 0; i < n; ++i)
				a[i] = sc.nextInt();

			sort(a);
			System.out.print("SORTED ARRAY: ");
			for (int i = 0; i < n; ++i)
				System.out.print(a[i] + " ");

			int[][] b = new int[n][n];
			fill(b, a);
			System.out.println("\nFILLED MATRIX");
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n; ++j)
					System.out.print(b[i][j] + " ");
				System.out.println();
			}
		}
	}

	private static void sort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; ++i) {
			int min = a[i], minPos = i;
			for (int j = i + 1; j < n; ++j) {
				if (min > a[j]) {
					min = a[j];
					minPos = j;
				}
			}
			a[minPos] = a[i];
			a[i] = min;
		}
	}

	private static void fill(int[][] b, int[] a) {
		int n = a.length;
		for (int i = 0; i < n; ++i) {
			int offset = 0;
			for (int j = 0; j < n; ++j) {
				b[i][j] = a[j - offset];
				if (j == n - i - 1)
					offset = j + 1;
			}
		}
	}
}