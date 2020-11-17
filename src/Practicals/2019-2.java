import java.util.Scanner;

class SortAndFillMatrix {

	int n;
	int[] a;
	int[][] b;

	// Returns true if the input is valid
	boolean accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		n = sc.nextInt();
		if (n < 2 || n > 10) {
			System.out.println("MATRIX SIZE OUT OF RANGE");
			return false;
		}

		a = new int[n];
		System.out.print("ELEMENTS OF SINGLE DIMENSIONAL ARRAY: ");
		for (int i = 0; i < n; ++i) {
			a[i] = sc.nextInt();
		}
		return true;
	}

	// Sorts a using selection sort
	void sort() {
		int n = a.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	void fill() {
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

	void display() {
		sort();
		System.out.print("SORTED ARRAY: ");
		for (int i = 0; i < n; ++i) {
			System.out.print(a[i] + " ");
		}

		b = new int[n][n];
		fill();
		System.out.println("\nFILLED MATRIX");
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		SortAndFillMatrix obj = new SortAndFillMatrix();
		if (obj.accept()) {
			obj.display();
		}
	}
}
