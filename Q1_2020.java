import java.util.Scanner;

class Q1_2020 {

    public static void main(String[] args) {
        //Hi
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        if (m > n) {
            System.out.println("INVALID INPUT.");
        } else {
            System.out.println("THE PRIME-ADAM INTEGERS ARE:");
            int freq = 0;
            for (int i = m; i <= n; ++i) {
                if (isPrime(i) && isAdam(i)) {
                    freq++;
                    System.out.print(i + " ");
                }
            }
            if (freq == 0) {
                System.out.print("NIL");
            }
            System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS IS: " + freq);
        }
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAdam(int n) {
        int rev = reverse(n);
        return rev * rev == reverse(n * n);
    }

    private static int reverse(int n) {
        int c = n, rev = 0;
        while (c > 0) {
            rev = rev * 10 + c % 10;
            c /= 10;
        }
        return rev;
    }
}
