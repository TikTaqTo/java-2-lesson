package Task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            System.out.println("Yes");
        } else {
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a);
            System.out.println(b);
        }
    }
}
