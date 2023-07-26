package pr2;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double anglDegree;
        anglDegree = s.nextDouble();
        double angleRadian;
        angleRadian = anglDegree * Math.PI / 180;
        double result;
        result = Math.sin(angleRadian);
        System.out.print("Угол");
        System.out.printf("%.4f", anglDegree);
        System.out.print(" градусов это ");
        System.out.printf("%.4f", angleRadian);
        System.out.println(" радиан");
        System.out.print("Синус этого угла равен ");
        System.out.printf("%.4f", result);
    }
}