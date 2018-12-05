package leetcode_solutions;

// Java program for implementation of Heap Sort
public class HeapSort
{
    public void InitiateHeaport(int arr[])
    {
        int arrayLength = arr.length;

        // Build heap (rearrange array)
        for (int i = arrayLength / 2 - 1; i >= 0; i--)
            heapify(arr, arrayLength, i);

        // One by one extract an element from heap
        for (int i=arrayLength-1; i>=0; i--)
        {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int n, int root)
    {
        int largestElement = root;  // Initialize largest as root
        int left = 2*root + 1;  // left = 2*i + 1
        int right = 2*root + 2;  // right = 2*i + 2

        // If left child is larger than root
//        if (left < n && arr[largestElement].compareTo(arr[left]) < 0)
//            largestElement = left;

        // If right child is larger than largest so far
//        if (right < n && arr[largestElement].compareTo(arr[right]) < 0)
//            largestElement = right;

        // If largest is not root
        if (largestElement != root)
        {
            int swap = arr[root];
            arr[root] = arr[largestElement];
            arr[largestElement] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largestElement);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

        HeapSort ob = new HeapSort();
//        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
