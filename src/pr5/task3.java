package pr5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double y, z, x;
        x = s.nextInt();
        y = s.nextInt();
        z = s.nextInt();
        if(x >= -11){
            if(x <= 13){
                System.out.print(x+" ");
            }
        }
        if(y >= -11){
            if(y <= 13){
                System.out.print(y+" ");
            }
        }
        if(z >= -11){
            if(z <= 13){
                System.out.print(z);
            }
        }
    }
}