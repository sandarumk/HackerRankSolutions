/**
 *
 * https://www.hackerrank.com/challenges/java-string-tokens
 *
 * Given a string, S , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
 *
 * Input Format
 *
 * A single string, S.
 *
 * Constraints
 *
 * 1<= length of S <= 400000
 *
 * S is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
 *
 * Output Format
 *
 * On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .
 *
 * Sample Input
 *
 * He is a very very good boy, isn't he?
 *
 * Sample Output
 *
 * 10
 * He
 * is
 * a
 * very
 * very
 * good
 * boy
 * isn
 * t
 * he
 *
 *
 * Created by dinu on 12/10/16.
 */

import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim(); // to remove the leading zeros
        if(s.length()>0 && s.length() <= 400000){
            String[] tokenArray = s.split("[ !,?._'@]+");
            int tokenNo = tokenArray.length;
            System.out.println(tokenNo);
            for(int i = 0  ;i < tokenNo; i++){
                System.out.println(tokenArray[i]);
            }
        }
        if(s.length()==0){
            System.out.println("0");
        }

        scan.close();
    }
}
