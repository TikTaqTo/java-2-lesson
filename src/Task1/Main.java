package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int min = 10;
        int max = 20;

        boolean result = a > min && a < max  ? true : false;

        System.out.println(result);
    }
}
