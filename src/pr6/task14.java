package pr6;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int q;
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) {
            q = a;
            System.out.println("От A до B");
            while (q <= b) {
                System.out.print(q + " ");
                q = q + 1;
            }
        }
        if (a > b) {
            q = b;
            System.out.println("От B до A");
            while (q <= a) {
                System.out.print(q + " ");
                q = q + 1;
            }
        }
        if (a == b) {
            System.out.println("От B до A");
            System.out.print(a);
        }
    }
}