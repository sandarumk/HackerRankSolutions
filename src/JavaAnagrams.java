/**
 *
 * https://www.hackerrank.com/challenges/java-anagrams
 *
 * Two strings  and  are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of  CAT is
 * CAT, ATC, TCA, TAC,CTA, ACT
 *
 * Given two strings, print Anagrams if they are anagrams, print Not Anagrams if they are not. The strings may consist at most  English characters; the comparison should NOT be case sensitive.
 *
 * This exercise will verify that you can sort the characters of a string, or compare frequencies of characters.
 *
 * Sample Input 0
 *
 * anagram
 * margana
 *
 * Sample Output 0
 *
 * Anagrams
 *
 * Sample Input 1
 *
 * anagramm
 * marganaa
 *
 * Sample Output 1:
 *
 * Not Anagrams
 *
 * Created by dinu on 12/10/16.
 */


import java.util.*;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length()){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        Map<Character, Integer> anagramSet = new HashMap<Character, Integer>();
        for (int i = 0; i < a.length(); i++){
            char key = a.charAt(i);
            if(anagramSet.containsKey(key)){
                int count = anagramSet.get(key);
                count++;
                anagramSet.put(key,count);
            }else{
                anagramSet.put(key,1);
            }
        }

        for (int j = 0; j < b.length(); j++){
            char key = b.charAt(j);
            if(anagramSet.containsKey(key)){
                int count = anagramSet.get(key);
                count--;
                if(count <= 0){
                    anagramSet.remove(key);
                }else{
                    anagramSet.put(key,count);
                }
            }else{
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
