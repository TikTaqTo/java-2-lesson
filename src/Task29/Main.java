package Task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        switch (a) {
            case 1:
                a = in.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("You are financer");
                        break;
                    case 2:
                        System.out.println("You are Engineer");
                        break;
                    default:
                        System.out.println("You are idiot");
                }
                break;
            case 2:
                a = in.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("You are historic or diplomat");
                        break;
                    case 2:
                        System.out.println("You are Translator");
                        break;
                    default:
                        System.out.println("You are idiot");
                }
        }
    }
}
