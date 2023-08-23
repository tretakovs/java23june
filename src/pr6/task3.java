package pr6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        double a;
        double i;
        i = 7;//ог
        a = 1;//c
        System.out.print("\"");
        while (i >= a) {
            System.out.print(x);
            a = a + 1;
        }
        System.out.print("\"");
    }
}