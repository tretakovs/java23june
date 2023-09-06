package pr6;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int q;
        int l;
        a = s.nextInt();
        b = 25;
        if (a < b) {
            q = a;
            while (q <= b) {
                System.out.print(q + " ");
                q = q + 1;
            }
            l = b - a + 1;
            System.out.println();
            System.out.print("Всего чисел: " + l);
        }
        if (a > b) {
            q = a;
            while (q >= b) {
                System.out.print(q + " ");
                q = q - 1;
            }
            l = a - b + 1;
            System.out.println();
            System.out.print("Всего чисел: " + l);
        }
        if (a == b) {
            System.out.println(a);
            System.out.print("Всего чисел: 1");
        }
    }
}