package pr9;

import java.util.Scanner;

public class task2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split(",");
            int a = 0;
            int q = 2;
            int w = 3;
            int e = 5;
            System.out.println("В массиве длиной " + arr.length);
            System.out.println("значение на индексе " + a + " это " + arr[a]);
            if (2 >= arr.length) {
                    System.out.println("Нет элемента на индексе 2");
            }
            if (2 < arr.length) {
                System.out.println("значение на индексе " + q + " это " + arr[q]);
            }
            if (3 >= arr.length) {
                System.out.println("Нет элемента на индексе 3");
            }
            if (3 < arr.length) {
                System.out.println("значение на индексе " + w + " это " + arr[w]);
            }
            if (5 >= arr.length) {
                System.out.println("Нет элемента на индексе 5");
            }
            if (5 < arr.length) {
                System.out.println("значение на индексе " + e + " это " + arr[e]);
            }
        }
    }
}
