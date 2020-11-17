import java.util.Scanner;

class RowSort {

	int m, n;
	int[][] a;

	// Returns true if the input is valid
	boolean accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("M = ");
		m = sc.nextInt();
		System.out.print("N = ");
		n = sc.nextInt();

		if (2 < n && n < 9 && 2 < m && m < 9) {
			a = new int[m][n];
			System.out.println("ENTER ELEMENTS OF MATRIX");
			for (int i = 0; i < m; ++i) {
				for (int j = 0; j < n; ++j) {
					a[i][j] = sc.nextInt();
				}
			}
			return true;
		} else {
			System.out.println("MATRIX SIZE OUT OF RANGE");
			return false;
		}
	}

	// Sorts using selection sort
	void sort(int[] row) {
		for (int i = 0; i < row.length; ++i) {
			int copy = row[i];
			for (int j = i + 1; j < row.length; ++j) {
				if (row[j] < row[i]) {
					row[i] = row[j];
					row[j] = copy;
				}
			}
		}
	}

	void printMatrix(int[][] a) {
		for (int i = 0; i < a.length; ++i) {
			for (int j = 0; j < a[i].length; ++j) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	void display() {
		System.out.println("ORIGINAL MATRIX");
		printMatrix(a);
		for (int i = 0; i < m; ++i) {
			sort(a[i]);
		}
		System.out.println("MATRIX AFTER SORTING ROWS");
		printMatrix(a);
	}

	public static void main(String[] args) {
		RowSort obj = new RowSort();
		if (obj.accept()) {
			obj.display();
		}
	}
}
