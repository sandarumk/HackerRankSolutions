package crackingthecodinginterview;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-recursive-staircase
 * Created by dinu on 1/4/17.
 */
public class RecursionDavisStairCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int output = numberofWays(n);
            System.out.println(output);
        }
    }

    public static int numberofWays(int n){
        if(n == 1)
        {
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 4;
        }
        return numberofWays(n-1)+ numberofWays(n-2) + numberofWays(n-3);
    }
}
