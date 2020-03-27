import java.util.*;

class Q3_2020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char last = s.charAt(s.length() - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("INVALID INPUT");
        } else {
            StringTokenizer tok = new StringTokenizer(s, " \t.?!");
            String[] words = new String[tok.countTokens()];
            for (int i = 0; i < words.length; i++) {
                words[i] = tok.nextToken();
            }
            boolean swapped = true;
            while (swapped) {
                swapped = false;
                for (int i = 0; i < words.length - 1; i++) {
                    if (shouldSwap(words[i], words[i + 1])) {
                        swapped = true;
                        String temp = words[i];
                        words[i] = words[i + 1];
                        words[i + 1] = temp;
                    }
                }
            }
            System.out.println(s);
            for (int i = 0; i < words.length; i++) {
                System.out.print(words[i] + " ");
            }
        }
    }

    //Return true if b precedes a
    private static boolean shouldSwap(String a, String b) {
        if (b.length() < a.length()) {
            return true;
        } else if (b.length() > a.length()) {
            return false;
        } else {
            return b.compareTo(a) < 0;
        }
    }
}
