/**
 *
 * https://www.hackerrank.com/challenges/java-string-compare
 *
 * Given a string, find out the lexicographically smallest and largest substring of length .
 * [Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]
 *
 * Input Format
 *
 * First line will consist a string containing english alphabets which has at most 1000 characters. 2nd line will consist an integer k .
 *
 * Output Format
 * In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.
 *
 * Sample Input
 *
 * welcometojava
 * 3
 *
 * Sample Output
 *
 * ava
 * wel
 *
 * Created by dinu on 12/10/16.
 */

import java.util.Scanner;

public class JavaStringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int substringLength = sc.nextInt();

        if(s.length() <= substringLength){
            System.out.println(s);
            System.out.println(s);
            return;
        }

        String lexMin = s.substring(0,substringLength);
        String lexMax = s.substring(0,substringLength);

        for(int i =1; i < (s.length() - substringLength) +1; i++ ){
            String nextSubstring = s.substring(i,i+substringLength);
            if(nextSubstring.compareTo(lexMin) < 0){
                lexMin = nextSubstring;
            }
            if(nextSubstring.compareTo(lexMax) > 0){
                lexMax = nextSubstring;
            }
        }

        System.out.println(lexMin);
        System.out.println(lexMax);

    }
}
