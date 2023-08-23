package pr5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, c;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.print("Истинно");
            }
        }
        if (a >= b) {
            if (b < c) {
                System.out.print("Ложно");
            }
        }
        if (b >= c) {
            if (a < b) {
                System.out.print("Ложно");
            }
        }
        if (b >= c) {
            if (a >= b) {
                System.out.print("Ложно");
            }
        }
    }
}