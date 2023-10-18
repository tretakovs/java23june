package pr9;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split(" ");
            int a=0;
            System.out.println("Индекс последнего элемента "+ (arr.length-1));
            System.out.println("Значение последнего элемента " + arr[arr.length-1]);
            System.out.println("вместо " + arr[0] + " пишем " + arr[arr.length-1]);
            System.out.println("Элементы массива:");
            arr[0]=arr[arr.length-1];
            while (a <arr.length) {
                System.out.print(arr[a]);
                a++;
            }
        }
    }
}