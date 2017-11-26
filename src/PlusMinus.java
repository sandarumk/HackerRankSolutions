import java.util.Scanner;

/**
 * Created by dinu on 11/26/17.
 *
 * Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.

 Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

 Input Format

 The first line contains an integer, , denoting the size of the array.
 The second line contains  space-separated integers describing an array of numbers .

 Output Format

 You must print the following  lines:

 A decimal representing of the fraction of positive numbers in the array compared to its size.
 A decimal representing of the fraction of negative numbers in the array compared to its size.
 A decimal representing of the fraction of zeroes in the array compared to its size.
 Sample Input

 6
 -4 3 -9 0 4 1
 Sample Output

 0.500000
 0.333333
 0.166667

 */
public class PlusMinus {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int positive=0;
        int negative=0;
        int zero =0;
        int number =0;
        for(int i= 0; i < arraySize; i ++){
            number = sc.nextInt();
            if(number >0){
                positive++;
            }else if(number <0){
                negative++;
            }else{
                zero++;
            }
        }

        System.out.printf("%.6f \n", (float)positive/arraySize);
        System.out.printf("%.6f \n", (float)negative/arraySize);
        System.out.printf("%.6f \n", (float)zero/arraySize);


    }
}
