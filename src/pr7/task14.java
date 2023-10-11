package pr7;

import java.util.Scanner;

public class task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        int f;
        f = 0;
        a = 0;
        b = s.nextInt();
        while (f <= b) {
            System.out.println(f + " - " + a);
            f = f + 1;
            a = a + 1;
            if (a == 4) {
                a = 0;
            }
        }
    }
}

