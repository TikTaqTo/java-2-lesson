package Task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        String result = a == b || a == c || b == c ? "Yes" : "No";

        System.out.println(result);
    }
}
