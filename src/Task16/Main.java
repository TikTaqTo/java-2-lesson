package Task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int result = 0;

        if(a > 20){
            result = a / 6;
        }else {
            result = a * 6;
        }

        System.out.println(result);
    }
}
