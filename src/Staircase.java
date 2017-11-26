import java.util.Scanner;

/**
 * Created by dinu on 11/26/17.
 *
 *
 * Consider a staircase of size :

 #
 ##
 ###
 ####
 Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

 Write a program that prints a staircase of size .

 Input Format

 A single integer, , denoting the size of the staircase.

 Output Format

 Print a staircase of size  using # symbols and spaces.

 Note: The last line must have  spaces in it.

 Sample Input

 6
 Sample Output

 #
 ##
 ###
 ####
 #####
 ######
 Explanation

 The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of .
 */
public class Staircase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int stairwaySize = sc.nextInt();
        for(int i =0; i < stairwaySize; i ++){
            for(int j = 0; j < stairwaySize-i-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("#");
            }

            //next line
            System.out.println();
        }
    }
}
