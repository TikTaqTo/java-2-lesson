package Task21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] xyBlack = {2,2};
        int[] xyWhite = {2,2};

        if (xyBlack[0] == xyWhite[0] && xyBlack[1] == xyWhite[1])
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
