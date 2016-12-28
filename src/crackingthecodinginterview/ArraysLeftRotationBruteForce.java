package crackingthecodinginterview; /**
 *
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 *
 *
 * Created by dinu on 12/14/16.
 */

import java.util.*;

public class ArraysLeftRotationBruteForce {



        public static int[] arrayLeftRotation(int[] a, int n, int k) {
            int[] temp = new int[k];
            for(int j = 0; j < k; j++){
                temp[j] = a[j];
            }
            for (int l = 0; l+k < n ; l++){
                a[l] = a[l+k];
            }
            for (int m = 1; m <= k; m++){
                a[n-m] = temp[k-m];
            }
            return a;
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
