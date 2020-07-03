import java.util.Scanner;

class ZigZagMatrix {

    int[][] mat;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS AND COLUMNS: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        mat = new int[n][m];
        System.out.println("ENTER THE ELEMENTS:-");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        int n = mat.length, m = mat[0].length;
        for (int k = 0; k < n + m - 1; k++) {
            int i = Math.min(n - 1, k);
            int j = k - i;
            while (i >= 0 && j < m) {
                System.out.print(mat[i][j] + " ");
                i--;
                j++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ZigZagMatrix obj = new ZigZagMatrix();
        obj.accept();
        obj.display();
    }
}
