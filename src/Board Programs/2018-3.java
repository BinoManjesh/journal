import java.util.Scanner;

class VerticalDisplay {

	int n, maxSize;
	String[] teams;

	// Returns true if the input is valid
	boolean accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		n = sc.nextInt();
		sc.nextLine();

		if (2 < n && n < 9) {
			teams = new String[n];
			maxSize = 0;

			for (int i = 0; i < n; ++i) {
				System.out.print("Team " + (i + 1) + ": ");
				teams[i] = sc.nextLine();
				maxSize = Math.max(maxSize, teams[i].length());
			}
			return true;
		} else {
			System.out.println("INVALID INPUT");
			return false;
		}
	}

	void display() {
		for (int i = 0; i < maxSize; ++i) {
			for (int j = 0; j < n; ++j) {
				if (i < teams[j].length())
					System.out.print(teams[j].charAt(i) + "\t");
				else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
		VerticalDisplay obj = new VerticalDisplay();
		if (obj.accept()) {
			obj.display();
		}
	}
}
