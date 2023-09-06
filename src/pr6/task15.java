package pr6;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int q;
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) {
            q = a;
            System.out.println("По возрастанию");
            while (q <= b) {
                System.out.print(q + " ");
                q = q + 1;
            }
        }
        if (a > b) {
            q = a;
            System.out.println("По убыванию");
            while (q >= b) {
                System.out.print(q + " ");
                q = q - 1;
            }
        }
        if (a == b) {
            System.out.println("По убыванию");
            System.out.print(a);
        }
    }
}