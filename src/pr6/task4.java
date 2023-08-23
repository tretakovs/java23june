package pr6;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        int i;
        int a;
        x = s.nextInt();
        i = 1;
        a = 453;
        System.out.println("фунт\tграмм");
        while (i <= x) {
            System.out.println(i+"\t"+a);
            i = i + 1;
            a = a + 453;
        }
    }
}