/**
 * https://www.hackerrank.com/challenges/java-end-of-file
 *
 * Created by dinuk on 12/20/2016.
 */

import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext()){
            lineNumber++;
            System.out.println(lineNumber + " "+ sc.nextLine());
        }
    }
}
