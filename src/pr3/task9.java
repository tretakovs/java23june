package pr3;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dividend, divider, quotient, remainder;
        dividend = s.nextInt();
        divider = s.nextInt();
        if (divider <= 0) {
            System.out.print("Делитель не может быть равен 0");
        }


        if (divider > 0) {
            quotient = dividend / divider;
            remainder = dividend % divider;
            System.out.print("Делимое " + dividend + ", делитель " + divider + ", частное " + quotient + ", остаток " + remainder + ".");
        }
    }
}