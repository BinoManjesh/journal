import java.util.Scanner;

class DecimalMatrix {

    int m, n;
    int[][] matrix;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        m = sc.nextInt();
        System.out.print("N = ");
        n = sc.nextInt();

        if (m <= 0 || m >= 10 || n <= 2 || n >= 6) {
            System.out.println("OUT OF RANGE");
            return false;
        }

        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("ENTER ELEMENTS FOR ROW " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] < 0 || matrix[i][j] >= 8) {
                    System.out.println("INVALID INPUT");
                    return false;
                }
            }
        }
        return true;
    }

    void display() {
        System.out.println("FILLED MATRIX DECIMAL EQUIVALENT");
        for (int i = 0; i < m; i++) {
            int dec = 0;
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
                dec += matrix[i][j]*(int) Math.pow(8, n - 1 - j);
            }
            System.out.print(dec + "\n");
        }
    }

    public static void main(String[] args) {
        DecimalMatrix obj = new DecimalMatrix();
        if (obj.accept()) {
            obj.display();
        }
    }
}
