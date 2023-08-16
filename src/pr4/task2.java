package pr4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x, y, z;
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if (x > y) {
            if (x > z) {
                System.out.print("Наибольшее число x со значением " + x);
            }
        }
        if (y > x) {
            if (y > z) {
                System.out.print("Наибольшее число y со значением " + y);
            }
        }
        if (z > y) {
            if (z > x) {
                System.out.print("Наибольшее число z со значением " + z);
            }
        }
    }
}