import java.util.Scanner;

class CircularPrime {

    int n, pow;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        n = sc.nextInt();
    }

    void calculatePow() {
        int copy = n;
        pow = 1;
        while (copy > 0) {
            pow *= 10;
            copy /= 10;
        }
        pow /= 10;
    }

    int cyclicShift(int n) {
        return (n%10)*pow + n/10;
    }

    boolean isPrime(int n) {
        for (int i = 2; i < n; ++i) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }

    void display() {
        int num = n;
        boolean isCircularPrime = true;
        do {
            System.out.println(num);
            if (!isPrime(num)) {
                isCircularPrime = false;
            }
            num = cyclicShift(num);
        } while (num != n);

        if (isCircularPrime) {
            System.out.println(n + " IS A CIRCULAR PRIME");
        } else  {
            System.out.println(n + " IS NOT A CIRCULAR PRIME");
        }
    }

    public static void main(String[] args) {
        CircularPrime obj = new CircularPrime();
        obj.accept();
        obj.calculatePow();
        obj.display();
    }
}
