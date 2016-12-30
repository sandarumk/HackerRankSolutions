package crackingthecodinginterview;

import java.util.Scanner;

/**
 * Created by dinu on 12/30/16.
 */
public class RunningMedianNonHeap {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
                int currentIndex = a_i;
                double median = 0.0;
                if(currentIndex == 0){
                    median = a[0];
                }
                while(currentIndex >0 && a[currentIndex]<a[currentIndex-1]){
                    int temp = a[currentIndex];
                    a[currentIndex] = a[currentIndex-1];
                    a[currentIndex-1] = temp;
                    currentIndex--;
                    if(currentIndex <= 0){
                        break;
                    }
                }
                if(a_i%2 == 0){
                    median = a[a_i/2];
                }else{
                    median = (double)(a[a_i/2]+a[a_i/2+1])/2;
                }
                System.out.println(median);
            }
        }



    }



