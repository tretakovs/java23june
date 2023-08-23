package pr6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x;
        double i;
        i = s.nextInt();
        x = i + 10;
        while (x > i) {
            System.out.println(i + "---");
            i = i + 1;
        }
    }
}