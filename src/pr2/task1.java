package pr2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        //запесь от пользователя в x
        x = s.nextDouble();
        double result;
        //команда вычесления результата
        result =x+7;
        //пишет результат с точностью 4 знака после запятой
        System.out.printf("%.4f", result);

    }
}
