import java.util.*;

class Q2_2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M = ");
        int m = sc.nextInt();
        System.out.print("N = ");
        int n = sc.nextInt();
        if (m < 0 || m >= 10 || n <= 2 || n >= 6) {
            System.out.println("OUT OF RANGE");
            System.exit(0);
        }
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.print("ENTER ELEMENTS FOR ROW " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
                if (mat[i][j] < 0 || mat[i][j] >= 8) {
                    System.out.println("INVALID INPUT");
                    System.exit(0);
                }
            }
        }
        System.out.println("FILLED MATRIX\tDECIMAL EQUIVALENT");
        for (int i = 0; i < m; i++) {
            int dec = 0;
            for (int j = 0; j < n; j++) {
                System.out.print(" " + mat[i][j]);
                dec += mat[i][j] * (int)Math.pow(8, n - 1 - j);
            }
            System.out.print("\t" + dec + "\n");
        }
    }
}
