import java.util.Scanner;

class PrimePairs {

	int n;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		n = sc.nextInt();
	}

	boolean isPrime(int n) {
		for (int i = 2; i < n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	void display() {
		if (n % 2 != 0) {
			System.out.println("INVALID NUMBER. NUMBER IS ODD.");
		} else if (n <= 9 || n >= 50) {
			System.out.println("INVALID NUMBER. NUMBER OUT OF RANGE.");
		} else {
			System.out.println("PRIME PAIRS ARE:");
			for (int i = 3; i <= n/2; i += 2) {
				int p1 = i, p2 = n - i;
				if (isPrime(p1) && isPrime(p2))
					System.out.println(p1 + ", " + p2);
			}
		}
	}

	public static void main(String[] args) {
		PrimePairs obj = new PrimePairs();
		obj.accept();
		obj.display();
	}
}
