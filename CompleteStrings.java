import java.util.Scanner;

class CompleteStrings {

    String[] set1, set2;

    public static void main(String[] args) {
        CompleteStrings obj = new CompleteStrings();
        obj.accept();
        obj.printCompleteStrings();
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER SIZE OF SET 1: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println(n1);
        set1 = new String[n1];
        System.out.println("ENTER THE STRINGS OF SET 1:-");
        for (int i = 0; i < n1; i++) {
            set1[i] = sc.nextLine().toUpperCase();
        }

        System.out.print("ENTER SIZE OF SET 2: ");
        int n2 = sc.nextInt();
        sc.nextLine();
        set2 = new String[n2];
        System.out.println("ENTER THE STRINGS OF SET 2:-");
        for (int i = 0; i < n2; i++) {
            set2[i] = sc.nextLine().toUpperCase();
        }
    }

    void printCompleteStrings() {
        System.out.println("THE COMPLETE PAIRS ARE:-");
        for (int i = 0; i < set1.length; ++i) {
            for (int j = 0; j < set2.length; ++j) {
                String str = set1[i] + set2[j];
                if (isComplete(str))
                    System.out.println(str);
            }
        }
    }

    boolean isComplete(String s) {
        // arr[i] will store true if the ith char of the alphabet is in s
        boolean[] arr = new boolean[26];
        for (int i = 0; i < s.length(); i++)
            arr[s.charAt(i) - 65] = true;
        for (int i = 0; i < 26; i++)
            if (!arr[i])
                return false;
        return true;
    }
}

/*
4
abcdefgh
geeksforgeeks
lmnopqrst
abc
3
ijklmnopqrstuvwxyz
abcdefghijklmnopqrstuvwxyz
defghijklmnopqrstuvwxyz

 */
