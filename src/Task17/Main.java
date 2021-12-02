package Task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int result = 0;

        if (a > 0) {
            a += 1;
        } else if (a < 0) {
            a -= 2;
        } else {
            a = 10;
        }

        System.out.println(a);
    }
}
