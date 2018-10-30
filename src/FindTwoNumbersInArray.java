import java.util.ArrayList;
import java.util.Arrays;

public class FindTwoNumbersInArray {

    public boolean findSumPair(int[] input,int k){
        Arrays.sort(input);
        for(int i=0,j=input.length-1;j>i;){
            if(input[i]+input[j]==k){
                return true;
            }else if(input[i]+input[j] > k){
                j -= 1;
            }else if(input[i]+input[j] < k){
                i += 1;
            }
        }
        return false;
    }

    public static void main(String args[]){
        FindTwoNumbersInArray findSum =new FindTwoNumbersInArray();
        int[] input = {10, 15, 3, 7};
        System.out.println(findSum.findSumPair(input,19));
    }
}
