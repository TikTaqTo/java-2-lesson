package Task18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        if(a != b){
            int temp = a;
            a = a+b;
            b = b+temp;
        }else{
            a = 0;
            b = 0;
        }

        System.out.println(a);
        System.out.println(b);
    }
}
