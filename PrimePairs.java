import java.util.*;

class Q1_2018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int n = sc.nextInt();
		System.out.println("PRIME PAIRS ARE:");
		if (n % 2 != 0)
			System.out.println("INVALID NUMBER. NUMBER IS ODD."); 
		else if (n <= 9 || n >= 50)
			System.out.println("INVALID NUMBER. NUMBER IS EVEN.");
		for (int i = 3; i < n / 2; ++i) {
			int p1 = i, p2 = n - i;
			if (isPrime(p1) && isPrime(p2))
				System.out.println(p1 + ", " + p2);
		}
	}

	private static boolean isPrime(int n) {
		for (int i = 2; i < n; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}