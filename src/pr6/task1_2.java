package pr6;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextInt();
        System.out.println("Введение");
        if (x>=1) {
            System.out.println("глава 1");
        }
        if (x>=2) {
            System.out.println("глава 2");
        }
        if (x>=3) {
            System.out.println("глава 3");
        }
        if (x>=4) {
            System.out.println("глава 4");
        }
        if (x>=5) {
            System.out.println("глава 5");
        }
        if (x>=6) {
            System.out.println("глава 6");
        }
        if (x>=7) {
            System.out.println("глава 7");
        }
        System.out.println("заключение");
    }
}
