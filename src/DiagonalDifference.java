import java.util.Scanner;

/**
 * Created by dinu on 11/26/17.
 *
 * Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.

 Input Format

 The first line contains a single integer, . The next  lines denote the matrix's rows, with each line containing space-separated integers describing the columns.

 Constraints

 Output Format

 Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

 Sample Input

 3
 11 2 4
 4 5 6
 10 8 -12
 Sample Output

 15
 Explanation

 The primary diagonal is:

 11
 5
 -12
 Sum across the primary diagonal: 11 + 5 - 12 = 4

 The secondary diagonal is:

 4
 5
 10
 Sum across the secondary diagonal: 4 + 5 + 10 = 19
 Difference: |4 - 19| = 15
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[][] data = new int[size][size];
        int diag1Sum =0;
        int diag2Sum =0;
        for(int i = 0; i < size; i ++){
            for(int j = 0; j < size; j++){
                data[i][j] = sc.nextInt();
                if(i == j ){
                    diag1Sum += data[i][j];
                }
                if((i + j) == size-1 ){
                    diag2Sum += data[i][j];
                }
            }
        }
        System.out.println(java.lang.Math.abs(diag1Sum-diag2Sum));
    }
}
