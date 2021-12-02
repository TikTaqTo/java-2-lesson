package Task0;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();


        int result = a > b ? a : b;

        System.out.println(result);
    }
}
