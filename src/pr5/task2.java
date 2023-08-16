package pr5;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double a, b, x;
        a = s.nextInt();
        b = s.nextInt();
        x = s.nextInt();
        if (b < a) {
            System.out.print("Некорректный интервал. Левая граница должна быть меньше правой.");
        }
        if (x >= a) {
            if (x <= b) {
                System.out.print(x + " попадает в интервал от " + a + " до " + b);
            }
        }
        if (x > b) {
            System.out.print(x + " за пределами интервала от " + a + " до " + b);
        }
        if (x < a) {
            System.out.print(x + " за пределами интервала от " + a + " до " + b);
        }
    }
}
