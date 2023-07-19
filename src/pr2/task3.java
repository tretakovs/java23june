package pr2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String temp;



        System.out.println("задача 1976");
        System.out.println("Введите высоту прямоугольника");
        temp = s.nextLine();
        double height;
        height = Double.parseDouble(temp);
        System.out.println("Введите ширину прямоугольника");
        temp = s.nextLine();
        double width;
        width = Double.parseDouble(temp);
        double area;
        area=height*width;
        System.out.print("Площадь прямоугольника со сторонами ");
        System.out.printf("%.0f",height);
        System.out.print(" и ");
        System.out.printf("%.0f",width);
        System.out.print(" равно ");
        System.out.printf("%.0f",area);
    }
}

