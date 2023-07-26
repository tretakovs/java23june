package pr4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int diff,P,Q;
        P = s.nextInt();
        Q = s.nextInt();
        if (P > Q) {
            diff = P - Q;
            System.out.print("Максимальное " + P + ", минимальное " + Q + ". Разница " + diff + ".");
        }
        if (P < Q) {
            diff = Q - P;
            System.out.print("Максимальное " + Q + ", минимальное " + P + ". Разница " + diff + ".");
        }
    }
}