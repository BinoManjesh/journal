import java.util.Scanner;

class PendulumArray {

    int n;
    int[] array;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("N = ");
        n = sc.nextInt();
        array = new int[n];
        System.out.println("Enter the array:");
        for (int i = 0; i < n; ++i) {
            array[i] = sc.nextInt();
        }
    }

    // Sorts array using selection sort
    void sort() {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; ++j) {
                if (array[j] < array[i]) {
                    int copy = array[i];
                    array[i] = array[j];
                    array[j] = copy;
                }
            }
        }
    }

    void display() {
        int[] pendulum = new int[n];
        for (int i = 0; i < n; i++) {
            if (i%2 == 1) {
                pendulum[(n - 1)/2 + (i + 1)/2] = array[i];
            } else {
                pendulum[(n - 1)/2 - (i + 1)/2] = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(pendulum[i] + " ");
        }
    }

    public static void main(String[] args) {
        PendulumArray obj = new PendulumArray();
        obj.accept();
        obj.sort();
        obj.display();
    }
}
