import java.util.Scanner;

class DiagonalPrimeSum {

    int[][] mat;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE SIZE OF THE MATRIX: ");
        int n = sc.nextInt();
        mat = new int[n][n];
        System.out.println("ENTER THE ELEMENTS OF THE MATRIX:-");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
    }

    void printPrimeSum() {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            if (isPrime(mat[i][i]))
                sum += mat[i][i];
            if (isPrime(mat[i][n - i - 1]))
                sum += mat[i][n - i - 1];
        }
        System.out.println(sum);
    }

    boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) {
        DiagonalPrimeSum obj = new DiagonalPrimeSum();
        obj.accept();
        obj.printPrimeSum();
    }
}
