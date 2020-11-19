import java.util.Scanner;

class PrimeAdam {

    int m, n;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        m = sc.nextInt();
        System.out.print("n = ");
        n = sc.nextInt();

        if (m > n) {
            System.out.println("INVALID INPUT.");
            return false;
        }
        return true;
    }

    boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isAdam(int n) {
        int rev = reverse(n);
        return rev*rev == reverse(n * n);
    }

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev*10 + n%10;
            n /= 10;
        }
        return rev;
    }

    void display() {
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

    public static void main(String[] args) {
        PrimeAdam obj = new PrimeAdam();
        if (obj.accept()) {
            obj.display();
        }
    }
}
