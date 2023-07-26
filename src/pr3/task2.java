package pr3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        double edge;
        double height;
        edge = s.nextDouble();
        height = s.nextDouble();
        if (edge <= 0) {
            if(height > 0){
                System.out.print("Длина основания треугольника должна быть положительна");
            }
        }
        if (height <= 0) {
            if(edge > 0){
                System.out.print("Высота треугольника должна быть положительна");
            }
        }
        if(edge <= 0){
            if(height <= 0){
                System.out.print("Длина основания треугольника должна быть положительна\n" +
                        "Высота треугольника должна быть положительна");
            }
        }
        if(edge > 0){
            if(height > 0){
                double area;
                area=edge*height/2;
                System.out.print("Площадь прямоугольного треугольника с высотой "+height+" и основанием "+edge+" равна");
                System.out.print(area);
            }
        }

    }
}