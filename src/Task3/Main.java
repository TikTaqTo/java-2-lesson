package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();


        if (a <= 2019) {
            System.out.println("No");
        } else if (a >= 2021) {
            System.out.println("Yes");
        } else if (a == 2020) {
            System.out.println("Error");
        }
    }
}
