package leetcode_solutions;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

     Note:

     The number of elements initialized in nums1 and nums2 are m and n respectively.
     You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     Example:

     Input:
     nums1 = [1,2,3,0,0,0], m = 3
     nums2 = [2,5,6],       n = 3

     Output: [1,2,2,3,5,6]

    LeetCode Link : https://leetcode.com/problems/merge-sorted-array/description/
 */
public class MergeSortedArray {

    public void optimalMerge(int[] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        while (j >= 0){
            nums1[k--]=nums2[j--];
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(nums2.length == 0){
            return;
        }

        for(int i = 0;i<nums1.length;i++){
            if(nums1[i] > nums2[0]){
                int temp = nums1[i];
                nums1[i]=nums2[0];
                nums2[0]=temp;
                for(int j=0;j<nums2.length;j++){
                    i += 1;
                    nums1[i]=nums2[j];
                }
                break;
            }else if(nums1[i] == 0 && i==m-n){
                for(int j=0;j<nums2.length;j++){
                    nums1[i+1]=nums2[j];
                }
                break;
            }
        }
    }

//    public static void main(String args[]){
//        System.out.println("START : Merge Sorted Array");
//        int[] nums1 = {1};
//        int[] nums2 = {};
//        int m = 1;
//        int n = 0;
//        MergeSortedArray MS = new MergeSortedArray();
//        MS.merge(nums1,m,nums2,n);
//        MS.optimalMerge(nums1,m,nums2,n);
//        System.out.println("END : Merge Sorted Array");
//    }
}
