package pr3;

import java.util.Scanner;

public class task4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double velocity1;
        double velocity2;
        double distance;
        velocity1 = s.nextDouble();
        velocity2 = s.nextDouble();
        distance = s.nextDouble();
        if (velocity1 < 0) {
            System.out.println("Скорость должна быть неотрицательна");
        }
        if (velocity2 < 0) {
            System.out.println("Скорость должна быть неотрицательна");
        }
        if (distance < 0) {
            System.out.println("Расстояние должно быть неотрицательным");
        }
        if (velocity1 >= 0) {
            if (velocity2 >= 0) {
                if (distance >= 0) {
                    double result;
                    result = distance / (velocity1 + velocity2);
                    System.out.print("Автомобили встретятся через ");
                    System.out.printf("%.4f", result);
                    System.out.print(" часов");
                }
            }
        }
    }
}