package crackingthecodinginterview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by dinu on 1/1/17.
 */
public class BinarySearchIceCreamParlor {
    public static int binarySearch(int first, int last, IceCream[] arr, int search) {
        while(first <= last){
            int index = first + (last-first)/2;
            if(arr[index].flavor == search){
                return arr[index].index;
            }else if (search > arr[index].flavor){
                first = index+1;
            }else{
                last = index-1;
            }
        }
        return -1;


    }

    public static void main(String[] args) {

        int t;
        int n, m;

        Scanner in = new Scanner(System.in);
        t = in.nextInt();
        for(int test = 0; test < t; test++) {

            m = in.nextInt();
            n = in.nextInt();
            IceCream[] arr = new IceCream[n];

            for (int i = 0; i < n; i++)
                arr[i] = new IceCream(in.nextInt(), i + 1);

            Arrays.sort(arr);
            int firstIndex = 100000, secondIndex = 100000;
            for(int i = 0; i < n - 1 ; i++) {
                int search = m - arr[i].flavor;
                if(search >= arr[i].flavor) {
                    int index = binarySearch( i + 1, n - 1, arr, search);
                    if( index != -1 ) {
                        System.out.println( Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
                        break;

                    }
                }
            }

        }

    }

}


class IceCream implements Comparable{
    int flavor;
    int index;

    public IceCream(int flavor, int index) {
        this.flavor = flavor;
        this.index = index;
    }

    @Override
    public int compareTo(Object o) {
        IceCream ic = (IceCream) o;
        if(this.flavor == ic.flavor){
            return 0;
        }else if(this.flavor < ic.flavor){
            return -1;
        }
        else{
            return +1;
        }

    }

    @Override
    public boolean equals(Object o){
        IceCream ic = (IceCream) o;
        return (this.flavor == ic.flavor);

    }

}