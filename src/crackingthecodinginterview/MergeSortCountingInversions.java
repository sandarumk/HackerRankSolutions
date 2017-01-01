package crackingthecodinginterview;

import java.util.Scanner;

/**
 * Created by dinu on 1/1/17.
 */
public class MergeSortCountingInversions {
    public static long countInversions(int[] arr){
        int[] temp =arr.clone();
        return countInversions(arr,temp,0,arr.length-1);
    }

    public static long countInversions(int[] arr, int[] temp, int start, int end){
        long count = 0;
        if(start>=end){
            return count;
        }

       // int mid = (start+end)/2;
        int mid =start + (end - start) / 2;
        count += countInversions(arr,temp,start,mid);
        count += countInversions(arr,temp,mid+1,end);
        count += merge(arr,temp,start,end);
        return count;
    }

    public static long merge(int[] arr, int[] temp, int start, int end){
        long count = 0;
        int leftend = start + (end - start) / 2;
        int rightstart = leftend+1;

        int leftIndex = start;
        int rightIndex = rightstart;
        int index = start;

        while(leftIndex <= leftend && rightIndex <= end){
            if(arr[leftIndex] > arr[rightIndex]){
                count += leftend - leftIndex +1;
                temp[index] = arr[rightIndex];
                index++;
                rightIndex++;
            }else{
                temp[index] = arr[leftIndex];
                index++;
                leftIndex++;
            }
        }

        System.arraycopy(arr,leftIndex,temp,index,leftend-leftIndex+1);
        System.arraycopy(arr,rightIndex,temp,index,end-rightIndex+1);
        System.arraycopy(temp,start,arr,start,(end - start)+1);
        return count;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int arr[] = new int[n];
            for(int arr_i=0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            System.out.println(countInversions(arr));
        }
    }

}
