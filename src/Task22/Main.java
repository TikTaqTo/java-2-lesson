package Task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a > 0 && a < 6) {
            a += 10;
        } else if (a > 9 && a < 21) {
            a -= 5;
        } else if (a < 0 || a > 1000) {
            a *= 3;
        } else {
            a = 0;
        }

        System.out.println(a);
    }
}
