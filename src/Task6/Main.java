package Task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int max = a > b ? a : b;
        int min = a < b ? a : b;

        String result = max - min == 100 ? "Yes" : "No";

        System.out.println(result);
    }
}
