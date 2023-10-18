package pr9;

import java.util.Scanner;

public class task2 {
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
            if (0 < arr.length) {
                if (2 >= arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("значение на индексе " + a + " это " + arr[a]);
                    System.out.println("Нет элемента на индексе 2");
                    System.out.println("Нет элемента на индексе 3");
                    System.out.println("Нет элемента на индексе 5");
                }
            }
            if (2 < arr.length) {
                if (3 >= arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("значение на индексе " + a + " это " + arr[a]);
                    System.out.println("значение на индексе " + q + " это " + arr[q]);
                    System.out.println("Нет элемента на индексе 3");
                    System.out.println("Нет элемента на индексе 5");
                }
            }
            if (3 < arr.length) {
                if (5 >= arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("значение на индексе " + a + " это " + arr[a]);
                    System.out.println("значение на индексе " + q + " это " + arr[q]);
                    System.out.println("значение на индексе " + w + " это " + arr[w]);
                    System.out.println("Нет элемента на индексе 5");
                }
            }
            if (5 < arr.length) {
                System.out.println("В массиве длиной " + arr.length);
                System.out.println("значение на индексе " + a + " это " + arr[a]);
                System.out.println("значение на индексе " + q + " это " + arr[q]);
                System.out.println("значение на индексе " + w + " это " + arr[w]);
                System.out.println("значение на индексе " + e + " это " + arr[e]);
            }
        }
    }
}
