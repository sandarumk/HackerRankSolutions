/**
 *
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 *
 *
 * Created by dinu on 12/14/16.
 */

import java.util.*;

public class ArraysLeftRotationOptimized {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int[] temp = new int[n];
        for (int i =0; i < n; i ++){
            int newLocation = (i+n-k)%n;
            temp[newLocation] = a[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
