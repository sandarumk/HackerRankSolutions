/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block
 *
 * Created by dinuk on 12/20/2016.
 */

import java.util.*;

public class JavaStaticInitializerBlock {
    public static int B;
    public static int H;

    public static boolean flag = initializeClassVariable();

    private static boolean initializeClassVariable() {

        // initialization code goes here
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = true;
        if(B <=0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag =false;
        }
        return flag;
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
