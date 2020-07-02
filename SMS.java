import java.util.Scanner;

class SMS {

    final String[] CODE = new String[]{
            "2", "22", "222",
            "3", "33", "333",
            "4", "44", "444",
            "5", "55", "555",
            "6", "66", "666",
            "7", "77", "777", "7777",
            "8", "88", "888",
            "9", "99", "999", "9999"};

    String str, keys;
    int[] freq;

    SMS() {
        str = "";
        keys = "";
        freq = new int[9];
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE:-");
        str = sc.nextLine();
    }

    void findKeys() {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                keys += "0";
            } else {
                keys += CODE[c - 97];
            }
        }
    }

    void countFreq() {
        for (int i = 0; i < keys.length(); i++) {
            char c = keys.charAt(i);
            if (c == '0') {
                freq[0]++;
            } else {
                freq[Integer.parseInt(c + "") - 1]++;
            }
        }
    }

    void display() {
        System.out.println("Keys: " + keys);

        System.out.println("Key\tFrequency");
        if (freq[0] != 0) {
            System.out.println(0 + " - " + freq[0]);
        }
        for (int i = 2; i < 8; i++) {
            if (freq[i - 1] != 0) {
                System.out.println(i + " - " + freq[i - 1]);
            }
        }
    }

    public static void main(String[] args) {
        SMS obj = new SMS();
        obj.accept();
        obj.findKeys();
        obj.countFreq();
        obj.display();
    }
}
