package leetcode_solutions;

public class QuickSort {

    public int partition(int arr[],int lowIndex,int highIndex){
        int pivotElement = arr[highIndex];
        int index = (lowIndex-1);
        for(int i=lowIndex;i<highIndex;i++){
            if(arr[i]<=pivotElement){
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i]=temp;
            }
        }
        int tempVal = arr[index+1];
        arr[index+1]=arr[highIndex];
        arr[highIndex]=tempVal;

        return index+1;
    }

    public void sort(int[] arr,int lowIndex,int highIndex){
        if(lowIndex<highIndex){
            int partitionIndex = partition(arr,lowIndex,highIndex);
            sort(arr,lowIndex,partitionIndex-1);
            sort(arr,partitionIndex+1,highIndex);
        }
    }

    public void printArray(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String args[]){
        int arr[] = {10,7,8,9,1,5};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr,0,arr.length-1);
        quickSort.printArray(arr);

    }
}
