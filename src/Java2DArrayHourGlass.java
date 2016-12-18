/**
 * https://www.hackerrank.com/challenges/java-2d-array
 *
 *
 * Created by dinu on 12/18/16.
 */

import java.util.Scanner;

public class Java2DArrayHourGlass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        int largestSum = -99999;
        for (int l = 0; l < 6 - 2; l++) {
            for (int m = 0; m < 6 - 2; m++) {
                int sum = arr[l][m] + arr[l][m + 1] + arr[l][m + 2] + arr[l + 1][m + 1] + arr[l + 2][m] + arr[l + 2][m + 1] + arr[l + 2][m + 2];
                if (sum > largestSum)
                    largestSum = sum;
            }
        }
        System.out.println(largestSum);
    }
}
