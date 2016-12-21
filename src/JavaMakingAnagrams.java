/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams
 *
 * Created by dinu on 12/21/16.
 */

import java.util.*;


public class JavaMakingAnagrams {
    public static int numberNeeded(String first, String second) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for(int i = 0; i < first.length(); i++){
            if(!charMap.containsKey(first.charAt(i))){
                charMap.put(first.charAt(i),1);
            }else{
                int temp = charMap.get(first.charAt(i));
                charMap.put(first.charAt(i),++temp);
            }
        }
        for(int j = 0; j < second.length(); j++){
            if(!charMap.containsKey(second.charAt(j))){
                charMap.put(second.charAt(j),-1);
            }else{
                int temp = charMap.get(second.charAt(j));
                charMap.put(second.charAt(j),--temp);
            }

        }
        int sum = 0;
        for (int value:charMap.values()){
            sum += Math.abs(value);
        }
        return sum;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
