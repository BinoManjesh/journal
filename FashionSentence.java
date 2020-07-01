import java.util.Scanner;
import java.util.StringTokenizer;

class FashionSentence {

    String str;
    int a, b;

    private static String shift(String word) {
        String output = "";
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'Z') {
                output += 'A';
            } else if (c == 'z') {
                output += 'a';
            } else {
                output += (char) (c + 1);
            }
        }
        return output;
    }

    public static void main(String[] args) {

        int i = 1;
        String output = "";
        while (tok.hasMoreTokens()) {
            String word = tok.nextToken();
            if (i == a || i == b) {
                output += shift(word) + " ";
            } else {
                output += word + " ";
            }
            ++i;
        }
        System.out.println(output);
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE:-");
        str = sc.nextLine();
        System.out.println("ENTER THE 2 INDICES");
        a = sc.nextInt();
        b = sc.nextInt();
        StringTokenizer tok = new StringTokenizer(str);
    }
}
