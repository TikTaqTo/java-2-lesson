package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a > 100) {
            a = 0;
        } else if (a < -100) {
            a++;
        }

        System.out.println(a);
    }
}
