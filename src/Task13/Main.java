package Task13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String result = a == b && b == c && a == c ? "Yes" : "No";

        System.out.println(result);
    }
}
