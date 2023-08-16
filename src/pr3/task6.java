package pr3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        double result;
        x = s.nextDouble();
        if (61 < x) {
            System.out.print("Подкоренное выражение должно быть неотрицательным");
        }
        if (61 >= x) {
            result = 3 * Math.sqrt(61 - x);
            System.out.print("Результат вычисления ");
            System.out.printf("%.4f", result);
        }
    }
}

