package daily_coding_challenges;

/*

    This problem was asked by Google.

    Given a sorted list of integers, square the elements and give the output in sorted order.

    For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].
 */


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prob118_Sorted_Squares_List {

    //Brute force approach
    //Time complexity : O(nlogn)
    //Space complexity : O(1)
    private static List<Integer> sortedSquresList(List<Integer> input_list){
        //calculate squares of each number in list
        for(int i = 0;i<input_list.size() ;i++){
            input_list.set(i,(int) Math.pow(input_list.get(i),2));
        }
        //sorting
        Collections.sort(input_list);

        return input_list;
    }

    //Linear approach
    //Time complexity : O(n)
    //Space complexity : O(n)
    private static List<Integer> sortedSquresListLinear(List<Integer> input_list){
        int p1 = 0;
        int p2 = input_list.size()-1;
        int op_list_index = input_list.size();
        Integer[] op_arr = new Integer[op_list_index];
        --op_list_index;

        while(p2 >= p1){
            if(Math.abs(input_list.get(p1)) >= Math.abs(input_list.get(p2))){
                op_arr[op_list_index]=(int)Math.pow(input_list.get(p1),2);
                p1++;
            }else{
                op_arr[op_list_index]=(int)Math.pow(input_list.get(p2),2);
                p2--;
            }
            op_list_index--;
        }

        return Arrays.asList(op_arr);
    }



    public static void main(String[] args) {
        System.out.println("Sorted Squares List");
        Integer[] input = {-9, -2, 0, 2, 3};

//        for(Integer each :sortedSquresList(Arrays.asList(input))){
//            System.out.println(each);
//        }

        for(Integer each :sortedSquresListLinear(Arrays.asList(input))){
            System.out.println(each);
        }


    }
}
