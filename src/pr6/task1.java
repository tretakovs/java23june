package pr6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        x = s.nextInt();
        int i;
        i=1;
        System.out.println("Введение");
        while (x>=i) {
            System.out.println("глава "+i);
            i=i+1;
        }
        System.out.println("заключение");
    }
}
