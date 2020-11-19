import java.util.*;

class PalindromeWords {

	String s;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		s = sc.nextLine();
	}

	void display() {
		if (isValid()) {
			StringTokenizer tok = new StringTokenizer(s, " .?!");
			while (tok.hasMoreTokens()) {
				String word = tok.nextToken();
				String reverse = reverse(word);
				if (reverse.equals(word))
					System.out.print(word + " ");
				else
					System.out.print(word + reverse.substring(1) + " ");
			}
		} else {
			System.out.println("INVALID INPUT");
		}
	}

	boolean isValid() {
		for (int i = 0; i < s.length() - 1; ++i) {
			char c = s.charAt(i);
			if (!Character.isUpperCase(c) && c != ' ') {
				return false;
			}
		}
		switch (s.charAt(s.length() - 1)) {
			case '.':
			case '?':
			case '!':
				return true;
			default:
				return false;
		}
	}

	String reverse(String s) {
		if (s.length() == 1) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static void main(String[] args) {
		PalindromeWords obj = new PalindromeWords();
		obj.accept();
		obj.display();
	}
}
