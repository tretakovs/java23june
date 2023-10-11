package pr7;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        while (6 < 7) {
            a = s.nextInt();
            if (a < 0) {
                System.out.println("Пользователь ввёл " + a);
                System.out.println("МАЛЕНЬКОЕ");

            }
            if (a > 20) {
                System.out.println("Пользователь ввёл " + a);
                System.out.println("БОЛЬШОЕ");
            }
            if (a <= 20) {
                if (a >= 0){
                    System.out.println("Пользователь ввёл " + a);
                }
            }
        }
    }
}
