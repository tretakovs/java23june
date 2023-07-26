package pr2;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double angleRadian;
        double angleDegree;
        angleRadian = s.nextDouble();
        angleDegree = angleRadian / Math.PI * 180;
        System.out.print(angleRadian + " радиан это ");
        System.out.printf("%.4f", angleDegree);
        System.out.print(" градусов");

    }
}