import java.util.Scanner;
import java.util.StringTokenizer;

class FashionSentence {

    String str;
    int a, b;

    public static void main(String[] args) {
        FashionSentence obj = new FashionSentence();
        obj.accept();
        obj.printSentence();
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE:-");
        str = sc.nextLine();
        System.out.println("ENTER THE 2 INDICES");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    String shift(String word) {
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

    void printSentence() {
        int i = 1;
        String output = "";
        StringTokenizer tok = new StringTokenizer(str);
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
}
