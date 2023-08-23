package pr5;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextInt();
        if (x >= -11) {
            if (x <= -3) {
                System.out.print("Красный");
            }
        }
        if (x >= 5) {
            if (x <= 19) {
                System.out.print("Зеленый");
            }
        }
        if (x < -11) {
            System.out.print("X не попадает ни в зеленый, ни в красный интервал");
        }
        if (x > 19) {
            System.out.print("X не попадает ни в зеленый, ни в красный интервал");
        }
        if (x > -3) {
            if (x < 5) {
                System.out.print("X не попадает ни в зеленый, ни в красный интервал");
            }
        }
    }
}




