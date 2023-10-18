package pr9;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split(" ");
            int a = s.nextInt();
            int q;
            int w;
            q = a - 1;
            w = a + 1;
            if (a>=0) {
                if (a<arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("значение на индексе " + a + " это " + arr[a]);
                    if (0 > q) {
                        System.out.println("Предыдущий элемент не существует");
                    }
                    if (0 <= q) {
                        System.out.println("Значение предыдущего элемента " + arr[q]);
                    }
                    if (arr.length <= w) {
                        System.out.println("Следующий элемент не существует");
                    }
                    if (arr.length > w) {
                        System.out.println("Значение следующего элемента " + arr[w]);
                    }
                }
            }
            if (arr.length <= a) {
                System.out.println("Число T должно быть в интервале [0, размер массива)");
            }
            if (0 > a) {
                System.out.println("Число T должно быть в интервале [0, размер массива)");
            }
        }
    }
}
