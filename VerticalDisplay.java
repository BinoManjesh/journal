import java.util.Scanner;

class VerticalDisplay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        int n = sc.nextInt();
        sc.nextLine();
        if (2 < n && n < 9) {
            String[] teams = new String[n];
            int maxSize = 0;

			for (int i = 0; i < n; ++i) {
				System.out.print("Team " + (i + 1) + ": ");
				teams[i] = sc.nextLine();
				maxSize = Math.max(maxSize, teams[i].length());
			}

			for (int i = 0; i < maxSize; ++i) {
				for (int j = 0; j < n; ++j) {
					if (i < teams[j].length())
						System.out.print(teams[j].charAt(i) + "\t");
					else
						System.out.print("\t");
				}
				System.out.println();
			}
		} else
			System.out.println("INVALID INPUT");
		
	}
}