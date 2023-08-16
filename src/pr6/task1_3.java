package pr6;

import java.util.Scanner;

public class task1_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextInt();
        int i;
        i=1;
        System.out.println("Введение");
        if (x>=i) {
            System.out.println("глава "+i);
            i=i+1;
        }
        if (x>=i) {
            System.out.println("глава "+i);
            i=i+1;
        }
        if (x>=i) {
            System.out.println("глава "+i);
            i=i+1;
        }
        if (x>=i) {
            System.out.println("глава "+i);
            i=i+1;
        }
        System.out.println("заключение");
    }
}
