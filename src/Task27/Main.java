package Task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        if (a == "user" && b == "qwerty") {
            System.out.println("Authentication completed");
        } else {
            System.out.println("Invalid login or password");
        }
    }
}
