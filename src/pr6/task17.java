package pr6;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int q;
        int r;
        int l;
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) {
            q = a;
            r = b;
            while (q <= b) {
                System.out.println(q + " " + r);
                q = q + 1;
                r = r - 1;
            }
            l = b-a+1;
            System.out.println("Всего строк  " + l);
        }
        if (a > b) {
            q = a;
            r = b;
            while (q >= b) {
                System.out.println(q + " " + r);
                q = q - 1;
                r = r + 1;
            }
            l = a-b+1;
            System.out.println("Всего строк  " + l);
        }
    }
}