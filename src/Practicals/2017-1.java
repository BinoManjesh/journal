import java.util.Scanner;

class Cartons {

    int n;

    void accept() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }

    void display() {
        if (n > 1000) {
            System.out.println("INVALID INPUT");
        } else {
            int remainder = n, totalCartons = 0;
            for (int i = 48; i >= 6; i /= 2) {
                int cartons = remainder/i;
                if (cartons != 0) {
                    System.out.println("\t\t\t\t\t\t" + i + "\tX\t" + cartons + "\t= " + i*cartons);
                    remainder %= i;
                    totalCartons += cartons;
                }
            }

            System.out.print("Remaining boxes \t\t");
            if (remainder == 0) {
                System.out.println("\t\t = 0");
            } else {
                ++totalCartons;
                System.out.println(remainder + "\tX\t1\t= " + remainder);
            }
            System.out.println("Total number of boxes\t\t\t\t= " + n);
            System.out.println("Total number of cartons\t\t\t\t= " + totalCartons);
        }
    }

    public static void main(String[] args) {
        Cartons obj = new Cartons();
        obj.accept();
        obj.display();
    }
}
