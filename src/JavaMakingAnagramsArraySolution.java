/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 * In the previous solution  we made a map from the letters.
 * Here instead of making a map, we made an array of frequencies
 *
 * Created by dinu on 12/21/16.
 */

import java.util.Scanner;

public class JavaMakingAnagramsArraySolution {

    public static int numberNeeded(String first, String second) {
        int[] lettercounts = new int[26];
        for(char c : first.toCharArray()){
            lettercounts[c-'a']++;
        }
        for(char c : second.toCharArray()){
            lettercounts[c-'a']--;
        }
        int result = 0;
        for(int i : lettercounts){
            result += Math.abs(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

