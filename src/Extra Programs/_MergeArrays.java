import java.util.Scanner;

class MergeArrays {
    int na, nb;
    int[] a, b, merged;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array 1: ");
        na = sc.nextInt();
        a = new int[na];
        System.out.println("Enter array 1");
        for (int i = 0; i < na; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Size of array 2: ");
        nb = sc.nextInt();
        b = new int[nb];
        System.out.println("Enter array 2");
        for (int i = 0; i < nb; i++) {
            b[i] = sc.nextInt();
        }
    }

    void merge() {
        merged = new int[na + nb];
        int i = 0, j = 0, k = 0;
        while(k < na + nb) {
            if (i < na && (j >= nb || a[i] < b[j])) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }
    }

    void display() {
        for (int i = 0; i < na + nb; i++) {
            System.out.print(merged[i] + " ");
        }
    }

    public static void main(String[] args) {
        MergeArrays obj = new MergeArrays();
        obj.accept();
        obj.merge();
        obj.display();
    }
}
