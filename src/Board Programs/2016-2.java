import java.util.Scanner;

class SortMatrix {

    int m;
    int[][] a;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        m = sc.nextInt();
        if (3 < m && m < 10) {
            a = new int[m][m];
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < m; ++j) {
                    a[i][j] = sc.nextInt();
                }
            }
            return true;
        } else {
            System.out.println("THE MATRIX SIZE IS OUT OF RANGE.");
            return false;
        }
    }

    void rearrange() {
        int[] nonBoundary = new int[(m - 2)*(m - 2)];
        int k = 0;
        for (int i = 1; i < m - 1; ++i) {
            for (int j = 1; j < m - 1; ++j) {
                nonBoundary[k++] = a[i][j];
            }
        }

        // Sorts array nonBoundary using selection sort
        for (int i = 0; i < nonBoundary.length; ++i) {
            for (int j = i + 1; j < nonBoundary.length; ++j) {
                if (nonBoundary[j] < nonBoundary[i]) {
                    int copy = nonBoundary[i];
                    nonBoundary[i] = nonBoundary[j];
                    nonBoundary[j] = copy;
                }
            }
        }

        k = 0;
        for (int i = 1; i < m - 1; ++i) {
            for (int j = 1; j < m - 1; ++j) {
                a[i][j] = nonBoundary[k++];
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < m; i++) {
            System.out.print('\t');
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void display() {
        System.out.println("ORIGINAL MATRIX");
        printMatrix();

        rearrange();
        System.out.println("REARRANGED MATRIX");
        printMatrix();

        System.out.println("DIAGONAL ELEMENTS");
        int sum = 0;
        for (int i = 0; i < m; ++i) {
            System.out.print('\t');
            for (int j = 0; j < m; ++j) {
                if (i == j || i == m - j - 1) {
                    sum += a[i][j];
                    System.out.print(a[i][j] + "\t");
                } else {
                    System.out.print('\t');
                }
            }
            System.out.println();
        }
        System.out.println("SUM OF THE DIAGONAL ELEMENTS = " + sum);
    }

    public static void main(String[] args) {
        SortMatrix obj = new SortMatrix();
        if (obj.accept()) {
            obj.display();
        }
    }
}
