package pr4;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double k;
        double result;
        k = s.nextInt();
        if(k>0) {
            result=Math.sqrt(k);
            System.out.print("Корень из "+k+" равен ");
            System.out.printf("%.4f", result);
        }
        if(k<=0) {
            result=k*k;
            System.out.print("Квадрат числа "+k+" равен ");
            System.out.printf("%.4f", result);
        }
    }
}