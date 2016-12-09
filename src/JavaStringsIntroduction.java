/**
 * Problem
 *
 * https://www.hackerrank.com/challenges/java-strings-introduction
 * This exercise is to test your understanding of Java Strings. A sample String declaration:
 *
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.
 *
 * Given two strings of lowercase English letters,  and , perform the following operations:
 *
 * Sum the lengths of  and .
 * Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 * Capitalize the first letter in  and  and print them on a single line, separated by a space.
 *
 * Input Format
 *
 * The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
 *
 * Output Format
 *
 * There are three lines of output:
 * For the first line, sum the lengths of  and .
 * For the second line, write Yes if  is lexicographically larger than  or No if it is not.
 * For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
 *
 * Sample Input
 *
 * hello
 * java
 *
 * Sample Output
 *
 * 9
 * No
 * Hello Java
 *
 * Explanation
 *
 * String A is "hello" and Bis "java".
 *
 * A has a length of 4, and B has a length of 5; the sum of their lengths is 9.
 * When sorted alphabetically/lexicographically, "hello" comes before "java"; therefore,  is not larger than  and the answer is No.
 *
 * When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".
 *
 * Created by dinu on 12/9/16.
 */

import java.io.*;
import java.util.*;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        // Print the length
        int lengthA = A.length();
        int lengthB = B.length();
        System.out.println (lengthA+lengthB);

        //Does A comes before B
        if (A.compareToIgnoreCase(B) > 0){
            System.out.println ("Yes");
        }else{
            System.out.println ("No");
        }
        
        //Capitalize the first letter
        A = A.substring(0,1).toUpperCase()+A.substring(1,lengthA);
        B = B.substring(0,1).toUpperCase()+B.substring(1,lengthB);
        System.out.println(A+ " " + B);


    }
}

