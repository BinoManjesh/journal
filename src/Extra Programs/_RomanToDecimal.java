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
