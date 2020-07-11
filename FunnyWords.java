import java.util.Scanner;
import java.util.StringTokenizer;

class FunnyWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE: ");
        String str = sc.nextLine();
        StringTokenizer tok = new StringTokenizer(str);
        System.out.println("THE HAHA WORDS ARE:-");
        while (tok.hasMoreTokens()) {
            String word = tok.nextToken();
            if (isFunny(word))
                System.out.println(word);
        }
    }

    static boolean isFunny(String word) {
        int n = word.length();
        for (int i = 1; i < word.length(); ++i)
            // Does not generate reverse of string. Reverses the index
            if (Math.abs(word.charAt(i) - word.charAt(i - 1)) != Math.abs(word.charAt(n - i - 1) - word.charAt(n - i)))
                return false;
        return true;
    }
}
