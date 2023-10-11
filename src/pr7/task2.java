package pr7;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        int q;
        a = s.nextInt();
        System.out.println("Текущее "+a+".  Предыдущее отсутствует.");
        while (6<7){
            q = a;
            a = s.nextInt();
            System.out.println("Текущее "+a+". Предыдущее "+q);
        }
    }
}