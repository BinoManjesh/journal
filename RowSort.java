import java.util.*;

class Q2_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("M = ");
		int m = sc.nextInt();
		System.out.print("N = ");
		int n = sc.nextInt();

		if (2 < n && n < 9 && 2 < m && m < 9) {
			int a[][] = new int[m][n];
			System.out.println("ENTER ELEMENTS OF MATRIX");
			for (int i = 0; i < m; ++i)
				for (int j = 0; j < n; ++j)
					a[i][j] = sc.nextInt();

			System.out.println("ORIGINAL MATRIX");
			printMatrix(a);

			for (int i = 0; i < n; ++i)
				sort(a[i]);

			System.out.println("MATRIX AFTER SORTING ROWS");
			printMatrix(a);
		} else {
			System.out.println("MATRIX SIZE OUT OF RANGE");
		}
	}

	private static void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
	}

	private static void sort (int[] a) {
		for (int i = 0; i < a.length; ++i) {
			int min = a[i], minPos = i;
			for (int j = i + 1; j < a.length; ++j) {
				if (a[j] < min) {
					min = a[j];
					minPos = j;
				}
			}
			a[minPos] = a[i];
			a[i] = min;
		}
	}
}