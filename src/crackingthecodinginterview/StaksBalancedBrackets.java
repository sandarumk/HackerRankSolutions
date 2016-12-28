package crackingthecodinginterview; /**
 * For each string, print whether or not the string of brackets is balanced on a new line. If the brackets are balanced, print YES; otherwise, print NO.
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 * Created by dinuk on 12/28/2016.
 */

import java.util.*;


public class StaksBalancedBrackets {

    public static boolean isBalanced(String expression) {
        if(expression.length()%2 == 1){
            return false;
        }
        Stack<Character> expressionStack = new Stack<>();
        for(int i = 0; i < expression.length(); i++){
            char temp = expression.charAt(i);
            if(isOpeningCharacter(temp)){
                expressionStack.push(temp);
                continue;
            }
            if(isClosingCharacter(temp)){
                if(expressionStack.isEmpty()){
                    return false;
                }
                char complement = expressionStack.pop();
                if(isComplement(complement,temp)){
                    continue;
                }else{
                    return false;
                }
            }
        }

        return expressionStack.isEmpty();


    }

    public static boolean isOpeningCharacter(char a){
        if(a == '{' || a == '(' || a == '['){
            return true;
        }
        return false;
    }

    public static boolean isClosingCharacter(char a){
        if(a == '}' || a == ')' || a == ']'){
            return true;
        }
        return false;
    }


    public static boolean isComplement(char a, char b){
        if(a == '{' && b == '}'){
            return true;
        }
        if(a == '(' && b == ')'){
            return true;
        }
        if(a == '[' && b == ']'){
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}

