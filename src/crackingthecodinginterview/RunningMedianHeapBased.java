package crackingthecodinginterview;

import java.util.*;

/**
 * Created by dinu on 12/30/16.
 */
public class RunningMedianHeapBased {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(50000);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(50000, Collections.reverseOrder());
        for(int a_i=0; a_i < n; a_i++){
            int value = in.nextInt();
            double median=0.0;
            if(a_i ==0){
                maxHeap.add(value);
                median = (double) value;
            }else{
                int diff = getSizeDif(maxHeap.size(),minHeap.size());
                if(diff == 0){
                    if(value > maxHeap.peek()){
                        minHeap.add(value);
                        median = (double) minHeap.peek();
                    }else{
                        maxHeap.add(value);
                        median = (double) maxHeap.peek();
                    }

                }else if(diff < 0){
                    //maxheap is smaller
                    if(value < minHeap.peek()){
                        maxHeap.add(value);
                    }else{
                        maxHeap.add(minHeap.poll());
                        minHeap.add(value);

                    }
                    median = (double) (maxHeap.peek()+minHeap.peek())/2;
                }else{
                    //minheap is smaller
                    if(value > maxHeap.peek()){
                        minHeap.add(value);
                    }else{
                        minHeap.add(maxHeap.poll());
                        maxHeap.add(value);
                    }
                    median = (double) (maxHeap.peek()+minHeap.peek())/2;
                }

            }

            System.out.println(median);
        }
    }

    public static int getSizeDif(int maxHeapSize, int minHeapSize){
        return maxHeapSize-minHeapSize;
    }
}
