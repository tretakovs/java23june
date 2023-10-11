package pr9;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split("-");
            int a = s.nextInt();
            if (a <= arr.length) {
                System.out.println("В массиве длиной " + arr.length);
                System.out.println("на индексе " + a);
                System.out.println("находится элемент со значением '" + arr[a] + "'");
            }
            if (a > arr.length) {
                System.out.println("Число A должно быть в интервале [0, размер массива)");
            }
        }
    }
}