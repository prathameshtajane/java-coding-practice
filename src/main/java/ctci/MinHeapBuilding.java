package ctci;


import java.util.Arrays;

public class MinHeapBuilding {


    public void min_heapify_util(int[] input,int index){
        int leftNodeIndex = 2*index+1;
        int rightNodeIndex = 2*index+2;
        int minIndex = -1;
        if(leftNodeIndex < input.length && input[index] > input[leftNodeIndex]){
            minIndex = leftNodeIndex;
        }else{
            minIndex = index;
        }

        if(rightNodeIndex < input.length && input[minIndex] > input[rightNodeIndex]){
            minIndex = rightNodeIndex;
        }

        if(minIndex != index){
            int temp = input[index];
            input[index]=input[minIndex];
            input[minIndex] = temp;
            min_heapify_util(input,minIndex);
        }

    }

    public int[] min_heapify(int[] input){
        for(int i = (int)(Math.floor(input.length/2)-1);i>=0;i--){
            min_heapify_util(input,i);
        }
        return input;
    }

    public int getMinFromMinHeap(int[] min_heap_input){
        return min_heap_input[0];
    }

    public int[] addElement(int[] oldInputArray,int newElement){

        int[] newArray = Arrays.copyOfRange(oldInputArray,0,oldInputArray.length+1);
        newArray[oldInputArray.length]=newElement;
        int i=oldInputArray.length;

        while(i > 0 && newArray[(int)Math.floor((i-1)/2)]>newArray[i]){
            int temp = newArray[i];
            newArray[i]=newArray[(int)Math.floor((i-1)/2)];
            newArray[(int)Math.floor((i-1)/2)]=temp;
            i=(int)Math.floor((i-1)/2);
        }
        return newArray;
    }

    public static void main(String args[]){
        System.out.println("MinHeapBuilding");
        int[] testInput = {5,4,3,2,1,0};
        MinHeapBuilding minHeap = new MinHeapBuilding();
        System.out.println(Arrays.toString(minHeap.min_heapify(testInput)));
        System.out.println(Arrays.toString(minHeap.addElement(minHeap.min_heapify(testInput),0)));
    }
}
