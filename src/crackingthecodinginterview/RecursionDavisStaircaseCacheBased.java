package crackingthecodinginterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dinu on 1/4/17.
 */
public class RecursionDavisStaircaseCacheBased {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap();
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            int output = numberofWays(n,map);
            System.out.println(output);
        }
    }

    public static int numberofWays(int n,Map<Integer,Integer> map ){

        int output =0;
        if(n == 1)
        {
            output=1;


        }
        if(n == 2){
            output=2;
        }
        if(n == 3){
            output=4;
        }if(n>3){
            if(!map.containsKey(n)){
                output = numberofWays(n-1,map)+ numberofWays(n-2,map) + numberofWays(n-3,map);
            }else{
                output = map.get(n);
            }
        }
        map.put(n,output);
        return output;
    }
}
