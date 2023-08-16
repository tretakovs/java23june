package pr3;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double edge;
        edge = s.nextDouble();
        if (edge <= 0) {
            System.out.print("Значение edge должно быть положительным");
        }
        if (edge > 0) {
            double area;
            area = 6 * edge * edge;
            System.out.print(area);

        }
    }
}