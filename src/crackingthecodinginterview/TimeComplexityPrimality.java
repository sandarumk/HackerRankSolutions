package crackingthecodinginterview;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-big-o
 * Created by dinu on 1/4/17.
 */
public class TimeComplexityPrimality {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            String output = isPrime(n)?"Prime":"Not prime";
            System.out.println(output);
        }
    }

    public static boolean isPrime(int n){
        if(n < 2){
            return false;
        }else if (n == 2){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
