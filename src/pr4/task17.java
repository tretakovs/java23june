package pr4;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x, y, z;

        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if (x < 0) {
            System.out.print(x+";");
        }
        if (x > 0) {
            double e;
            e=x*x;
            System.out.print(e+";");
        }
        if (y < 0) {
            System.out.print(y+";");
        }
        if (y > 0) {
            double w;
            w=y*y;
            System.out.print(w+";");
        }
        if (z < 0) {
            System.out.print(z);
        }
        if (z > 0) {
            double q;
            q=z*z;
            System.out.print(q);
        }
    }
}