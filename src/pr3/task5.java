package pr3;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextDouble();
        double result;
        if (x <= 0){
            System.out.print("Значение X должно быть неотрицательным");
        }
            if (x > 0) {
                result = Math.sqrt(x);
                System.out.print("корень из " + x + " равен ");
                System.out.printf("%.4f", result);
            }
    }
}