package Task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int maxSalary = 0;
        int minSalary = 0;

        if(a > b && a > c){
            maxSalary = a;
        }else if(b > a && b > c){
            maxSalary = b;
        }else {
            maxSalary = c;
        }

        if(a < b && a < c){
            minSalary = a;
        }else if(b < a && b < c){
            minSalary = b;
        }else {
            minSalary = c;
        }

        int result = maxSalary - minSalary;

        System.out.println(result);
    }
}
