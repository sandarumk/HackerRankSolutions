package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/ctci-lonely-integer
 * Created by dinu on 1/3/17.
 */
public class BitManipulationLonelyInteger {
    public static int lonelyInteger(int[] a) {
        HashMap<Integer,Integer> integers = new HashMap<>();
        for(int i = 0; i < a.length; i ++){
            if(integers.containsKey(a[i])){
                integers.remove(a[i]);
            }else{
                integers.put(a[i],1);
            }
        }
        int value =0;
        for(int key: integers.keySet()){
            value = key;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
