/**
 * https://www.hackerrank.com/challenges/java-bigdecimal
 *
 * Created by dinu on 12/20/2016.
 */

import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        //Write your code here
        BigDecimal[] decimalArray = new BigDecimal[n];
        for(int j = 0; j <n; j++){
            decimalArray[j] = new BigDecimal(s[j]);
        }
        for(int k = 0; k < n; k++){
            for(int m = 0; m < n-1; m++){
                if(decimalArray[m].compareTo(decimalArray[m + 1]) == -1){
                    BigDecimal temp = decimalArray[m + 1];
                    String stemp = s[m+1];
                    decimalArray[m+1] = decimalArray[m];
                    s[m+1] = s[m];
                    decimalArray[m] = temp;
                    s[m] = stemp;
                }
            }
        }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
