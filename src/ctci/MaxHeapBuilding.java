package ctci;

import java.util.Arrays;

public class MaxHeapBuilding {


    public void Max_Heapify(int[] input,int index){
        int leftNodeIndex = 2*index+1;
        int rightNodeIndex = 2*index+2;
        int largestIndex = -1;

        if(leftNodeIndex < input.length && input[leftNodeIndex] > input[index]){
            largestIndex = leftNodeIndex;
        }else{
            largestIndex = index;
        }

        if(rightNodeIndex < input.length && input[rightNodeIndex] > input[largestIndex]){
            largestIndex = rightNodeIndex;
        }

        if(largestIndex != index){
            int temp = input[index];
            input[index] = input[largestIndex];
            input[largestIndex]=temp;
            Max_Heapify(input,largestIndex);
        }

    }

    public int[] HeapifyTree(int[] input){
        for(int i = (int)Math.floor(input.length/2)-1;i>=0;i--){
            Max_Heapify(input,i);
        }
        return input;
    }

    public static void main(String args[]){
        System.out.println("MaxasdHeapBuilding");
        int[] test = {1,2,3,4,5,6,7};
        MaxHeapBuilding maxHeap = new MaxHeapBuilding();
        System.out.println(Arrays.toString(maxHeap.HeapifyTree(test)));
    }
}
