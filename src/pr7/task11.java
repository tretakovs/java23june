package pr7;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int f;
        int r;
        f = 10;
        b = 20;
        a = s.nextInt();

        while (f <= b) {
            if (a != f) {
                System.out.println(f);
            }
            if (a == f) {
                System.out.print(f);
                System.out.println(" Найдено");
            }
            f = f + 1;
        }
    }
}

