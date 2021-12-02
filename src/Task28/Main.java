package Task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        double wallet = 1000;
        double usd = 440;
        double eur = 510;
        double rub = 5.8;

        double result = 0;

        switch (a){
            case 1:
                result = wallet/usd;
                System.out.println(result);
                break;
            case 2:
                result = wallet/eur;
                System.out.println(result);
                break;
            case 3:
                result = wallet/rub;
                System.out.println(result);
                break;
        }
    }
}
