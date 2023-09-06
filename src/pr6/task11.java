package pr6;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int e;
        int r;
        int w;
        int q;
        x = s.nextInt();
        w = 10;
        q = 0;
        e = x;
        r = x;
        while (q <= w) {
            System.out.print(e + " ");
            e = e + 3;
            q = q + 1;
        }
        System.out.println();
        q = 0;
        r = x - 4 * 10;
        while (q <= w) {
            System.out.print(r + " ");
            r = r + 4;
            q = q + 1;
        }
    }
}
