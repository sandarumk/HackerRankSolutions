/**
 * https://www.hackerrank.com/challenges/java-datatypes
 *
 * Created by dinuk on 12/20/2016.
 */

import java.util.*;
import java.io.*;
import java.lang.Math;

public class JavaDataTypes {

    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                double shortLimit = (Math.pow(2,16))/2;
                if(x >= -(shortLimit) && x <= (shortLimit-1)) System.out.println("* short");
                double intLimit = (Math.pow(2,32))/2;
                if(x >= -(intLimit) && x <= (intLimit-1)) System.out.println("* int");
                double longLimit = (Math.pow(2,64))/2;
                if(x >= -(longLimit) && x <= (longLimit-1)) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
