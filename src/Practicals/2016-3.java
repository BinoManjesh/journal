import java.util.*;

class RearrangeString {

    String[] words;

    boolean accept() {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char last = sentence.charAt(sentence.length() - 1);
        if (last != '.' && last != '?' && last != '!') {
            System.out.println("INVALID INPUT");
            return false;
        }
        StringTokenizer tok = new StringTokenizer(sentence, " \t.!?");
        words = new String[tok.countTokens()];
        for (int i = 0; i < words.length; i++) {
            words[i] = tok.nextToken();
        }
        return true;
    }

    boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    void display() {
        String[] first = new String[words.length];
        String[] second = new String[words.length];
        int p = 0, q = 0, count = 0;
        for (int i = 0; i < words.length; ++i) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                count++;
                first[p++] = words[i];
            } else {
                second[q++] = words[i];
            }
        }

        System.out.println("NUMBER OF WORDS BEGINNING AND ENDING WITH A VOWEL = " + count);
        for (int i = 0; i < p; ++i) {
            System.out.print(first[i] + " ");
        }
        for (int i = 0; i < q; ++i) {
            System.out.print(second[i] + " ");
        }
    }

    public static void main(String[] args) {
        RearrangeString obj = new RearrangeString();
        if (obj.accept()) {
            obj.display();
        }
    }
}
