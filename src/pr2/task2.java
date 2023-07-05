package pr2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double anglDegree;
        //запесь от пользователя в x
        anglDegree = s.nextDouble();
        double result;
double angleRadian;
    angleRadian=anglDegree*Math.PI /180;
        //команда вычесления результ
        //пишет результат с точностью 4 знака после запятой
        System.out.printf("%.4f", anglDegree);
        System.out.print(" градусов это ");
        System.out.printf("%.4f", angleRadian);
        System.out.print(" радиан");
        

    }
}
