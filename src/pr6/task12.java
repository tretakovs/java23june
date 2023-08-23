package pr6;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        a = s.nextInt();
        b = s.nextInt();
        if (a > b) {
            System.out.print("Значение A должно быть не больше значения B");
        }
        while (a <= b) {
            System.out.print(a + ";");
            a = a + 1;
        }
    }
}