package daily_coding_challenges;

/*
    This problem was asked by Lyft.

    Given a list of integers and a number K, return which contiguous elements of the list sum to K.

    For example, if the list is [1, 2, 3, 4, 5] and K is 9, then it should return [2, 3, 4].

    Solution :

    q1 -> is the given list going to be always sorted?
          assumption -> Given array will not be always sorted.
    q2 -> what is there are multiple contiguous sub arrays that sum to K ?
          assumption -> return the first sub array that sum to K
    q3 -> Will there always be a solution ?
          assumption -> yes

    Algorithm :
        Brute Force -> create combination of all the sub arrays and check the sum

        Optimized solution -> Sliding window -> Time complexity = O(n)

 */


import java.util.Arrays;

public class Prob102_FindContiguousElementsSumToK {

    private static int[] findContiguousElementWithSumK(int[] inputElements,int k){
        int leftindex = 0,rightindex = 0;
        int sum = inputElements[leftindex];
        while (sum != k){
            if(sum < k){
                rightindex++;
                sum=sum+inputElements[rightindex];
            }else {
                  sum = sum - inputElements[leftindex];
                  leftindex++;
            }
        }
        return Arrays.copyOfRange(inputElements,leftindex,rightindex+1);
    }

    public static void main(String args[]){
        System.out.println("Prob102_Find Contiguous Elements Sum To K");
        //Test case 1
//        int[] inputArray = {1,2,3,4,5};
//        int k = 9;

        //Test case 2
        int[] inputArray = {1,9,2,3,5};
        int k = 10;
        System.out.println(Arrays.toString(findContiguousElementWithSumK(inputArray,k)));
    }
}
