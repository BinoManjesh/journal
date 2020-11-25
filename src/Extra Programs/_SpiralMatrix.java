import java.util.Scanner;

class SpiralMatrix {

    int n, m;
    int[][] matrix;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        n = sc.nextInt();
        System.out.print("Enter number of columns: ");
        m = sc.nextInt();
        matrix = new int[n][m];
        System.out.println("Enter the matrix:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        int i = 0, j = 0;
        int lowerBoundI = 0, upperBoundI = n - 1, lowerBoundJ = 0, upperBoundJ = m - 1;
        String direction = "RIGHT";
        while (lowerBoundI <= i && i <= upperBoundI && lowerBoundJ <= j && j <= upperBoundJ) {
            System.out.print(matrix[i][j] + "\t");
            switch (direction) {
                case "RIGHT":
                    if (j < upperBoundJ) {
                        ++j;
                    } else {
                        direction = "DOWN";
                        ++i;
                        ++lowerBoundI;
                    }
                    break;
                case "DOWN":
                    if (i < upperBoundI) {
                        ++i;
                    } else {
                        direction = "LEFT";
                        --j;
                        --upperBoundJ;
                    }
                    break;
                case "LEFT":
                    if (lowerBoundJ < j) {
                        --j;
                    } else {
                        direction = "UP";
                        --i;
                        --upperBoundI;
                    }
                    break;
                case "UP":
                    if (lowerBoundI < i) {
                        --i;
                    } else {
                        direction = "RIGHT";
                        ++j;
                        ++lowerBoundJ;
                    }
            }
        }
    }

    public static void main(String[] args) {
        SpiralMatrix obj = new SpiralMatrix();
        obj.accept();
        obj.display();
    }
}
