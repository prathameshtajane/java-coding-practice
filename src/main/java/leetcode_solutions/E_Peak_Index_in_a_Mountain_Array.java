package leetcode_solutions;


/**
 *  852. Peak Index in a Mountain Array
 *  Let's call an array A a mountain if the following properties hold:
 *
 * A.length >= 3
 * There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].
 *
 * Example 1:
 *
 * Input: [0,1,0]
 * Output: 1
 * Example 2:
 *
 * Input: [0,2,1,0]
 * Output: 1
 * Note:
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A is a mountain, as defined above.
 *
 * link : https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class E_Peak_Index_in_a_Mountain_Array {

    /**
     * Time Complexity : O(n)
     * Space Complexity : O(1)
     */
    public static int peakIndexInMountainArray(int[] A) {
        int max_index = -1;
        int max_val = Integer.MIN_VALUE;

        for(int i = 0 ; i < A.length ; i++){
            if(A[i]>max_val){
                max_index=i;
                max_val=A[i];
            }
        }
        return max_index;
    }

    /**
     * Time Complexity : O(logn)
     * Space Complexity : O(1)
     * Assumption : array should not be like {0,1,1,1,3,1}
     */
    public static int peakIndexInMountainArrayBinarySearch(int[] A) {
        int lo = 0;
        int hi = A.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (A[mid] < A[mid + 1]) { lo = mid + 1; } // peak index is after mid.
            else{ hi = mid; } // peak index <= mid.
        }
        return lo; // found peak index.
    }


    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{1,2,3,4,2}));
        System.out.println(peakIndexInMountainArrayBinarySearch(new int[]{1,2,3,4,2}));
        System.out.println(peakIndexInMountainArray(new int[]{0,1,0}));
        System.out.println(peakIndexInMountainArrayBinarySearch(new int[]{0,1,0}));

        System.out.println(peakIndexInMountainArray(new int[]{0,1,1,1,3,1}));
        System.out.println(peakIndexInMountainArrayBinarySearch(new int[]{0,1,1,1,3,1}));
    }
}
