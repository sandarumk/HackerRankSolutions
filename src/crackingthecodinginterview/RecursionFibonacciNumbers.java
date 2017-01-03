package crackingthecodinginterview;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-fibonacci-numbers
 * Created by dinu on 1/3/17.
 */
public class RecursionFibonacciNumbers {

    public static int fibonacci(int n) {
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
