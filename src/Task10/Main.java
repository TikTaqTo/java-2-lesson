package Task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if( a <= 12 && b < 3000 ){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
