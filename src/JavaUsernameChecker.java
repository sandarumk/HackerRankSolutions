/**

 https://www.hackerrank.com/challenges/valid-username-checker

 Regular expressions () help us match or search for patterns in strings. In this problem, you will be given a username. Your task is to check whether that username is valid. A valid username will have the following properties:

 The username can contain alphanumeric characters and/or underscores(_).
 The username must start with an alphabetic character.
 8 <=|Username| <=30.
 To simplify your task, we have provided a portion of the code in the editor. You just need to write down the pattern which will be used to validate the username input.

 Input Format

 The first line of input contains an integer , representing the number of testcases. Each of the next  lines contains a string that represents a username.

 Constraints

 The username consists of any printable characters.

 Output Format

 For each username, output Valid if the username is valid; otherwise, output Invalid.

 Sample Input

 4
 alpha_naheed
 xahidbuffon
 nagib@007
 123Swakkhar

 Sample Output

 Valid
 Valid
 Invalid
 Invalid
 Explanation

 The first two cases fulfill the constraints of a valid username. The third case is invalid because it contains an invalid character '@'. The fourth case is also invalid because it starts with a numeric character.

 Created by dinu on 12/10/16.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaUsernameChecker {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String username = in.nextLine();
            String pattern = "^[A-Za-z]{1}[A-Za-z_0-9]{7,29}$";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}



