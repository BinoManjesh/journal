import java.util.*;

class SortWords {

    String s;
    String[] words;

    // Returns true if the input is valid
    boolean accept() {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        char last = s.charAt(s.length() - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("INVALID INPUT");
            return false;
        }

        StringTokenizer tok = new StringTokenizer(s, " \t.?!");
        words = new String[tok.countTokens()];
        for (int i = 0; i < words.length; i++) {
            words[i] = tok.nextToken();
        }
        return true;
    }

    // Return true if a should come before b in the sorted sentence
    boolean lesserThan(String a, String b) {
        if (a.length() < b.length()) {
            return true;
        } else if (a.length() > b.length()) {
            return false;
        } else {
            return a.compareTo(b) < 0;
        }
    }

    // Sorts words using selection sort
    void sort() {
        for (int i = 0; i < words.length; ++i) {
            String copy = words[i];
            for (int j = i + 1; j < words.length; ++j) {
                if (lesserThan(words[j], words[i])) {
                    words[i] = words[j];
                    words[j] = copy;
                }
            }
        }

    }

    void display() {
        System.out.println(s);
        for (int i = 0; i < words.length; ++i) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {
            SortWords obj = new SortWords();
            if (obj.accept()) {
                obj.sort();
                obj.display();
            }
    }
}
