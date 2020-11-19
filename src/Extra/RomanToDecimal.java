import java.util.Scanner;

class RomanToDecimal {

    String roman;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ROMAN NUMERAL: ");
        roman = sc.next();
    }

    int getValue(char symbol) {
        switch (symbol) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    int getDigit(String s) {
        int digit = 0;
        for (int i = s.length() - 1; i >= 0; --i) {
            digit += getValue(s.charAt(i));
        }
        return digit;
    }

    int firstIndex(String s, char ch) {
        for (int i = 0; i < s.length(); ++i) {
            if (ch == s.charAt(i)) {
                return i;
            }
        }
        return s.length();
    }

    void display() {
        int decimal = 0, prev = 0;
        for (int i = roman.length() - 1; i >= 0; --i) {
            int value = getValue(roman.charAt(i));
            if (value < prev) {
                decimal -= value;
            } else {
                decimal += value;
            }
            prev = value;
        }
        System.out.println(decimal);
    }

    public static void main(String[] args) {
        RomanToDecimal obj = new RomanToDecimal();
        obj.accept();
        obj.display();
    }
}
