package crackingthecodinginterview;

import java.util.Scanner;

/**
 * Created by dinu on 1/1/17.
 */
public class GetBiggestRegion {

    public static int getBiggestRegion(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                max = Math.max(max, connections(matrix, i, j));
            }
        }
        return max;
    }

    private static int connections(int[][] matrix, int i, int j) {
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length) return 0;
        if (matrix[i][j] == 0) return 0;
        int connectioncount = 1;
        matrix[i][j] = 0; // we have to set this as zero. Otherwise it will be counted again and again in the recursion and it won't stop.

        connectioncount += connections(matrix, i + 1, j + 1);

        connectioncount += connections(matrix, i + 1, j);
        connectioncount += connections(matrix, i + 1, j - 1);

        connectioncount += connections(matrix, i - 1, j + 1);
        connectioncount += connections(matrix, i - 1, j - 1);
        connectioncount += connections(matrix, i - 1, j);

        connectioncount += connections(matrix, i, j + 1);
        connectioncount += connections(matrix, i, j - 1);

        return connectioncount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int grid[][] = new int[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        System.out.println(getBiggestRegion(grid));
    }
}
