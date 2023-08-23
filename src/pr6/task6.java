package pr6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        double i;
        double a;
        i = 10;//ог
        a = 0;//c
        x = s.nextInt();
        while (a <= i) {
            System.out.print(x+" ");
            a = a + 1;
            x = x + 3;
        }
    }
}