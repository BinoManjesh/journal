import java.util.Scanner;

class CaesarCipher {

    String plainText;

    void accept() {
        Scanner sc = new Scanner(System.in);
        plainText = sc.nextLine();
    }

    char shift(char ch) {
        if (Character.isLowerCase(ch)) {
            if (ch <= 'm') {
                return (char)(ch + 13);
            } else {
                return (char)(ch - 13);
            }
        } else if (Character.isUpperCase(ch)) {
            if (ch <= 'M') {
                return (char)(ch + 13);
            } else {
                return (char)(ch - 13);
            }
        } else {
            return ch;
        }
    }

    void display() {
        if (3 <= plainText.length() && plainText.length() < 100) {
            String cipher = "";
            for (int i = 0; i < plainText.length(); ++i) {
                cipher += shift(plainText.charAt(i));
            }
            System.out.println("The cipher text is:\n" + cipher);
        } else {
            System.out.println("INVALID LENGTH");
        }
    }

    public static void main(String[] args) {
        CaesarCipher obj = new CaesarCipher();
        obj.accept();
        obj.display();
    }
}
