package coursera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCostToMakeAllPalindromes {


    private static int getMinCostToMakeStringPalidrome(String string){
        char[] char_array = string.toCharArray();
        int temp_cost = 0;
        for(int i = 0 ; i < char_array.length/2 ; i++){
            temp_cost += Math.abs((int) char_array[i] - (int) char_array[char_array.length -1-i]);
        }
        return temp_cost;
    }

    private static List<Integer> getTotalMinCostForEachString(List<String> string_list){
        List<Integer> op_cost_list = new ArrayList<>();
        for(String each : string_list){
            op_cost_list.add(getMinCostToMakeStringPalidrome(each.toLowerCase()));
        }
        return op_cost_list;
    }


    public static void main(String[] args) {
        System.out.println("Find the minimum cost to make all strings palindrome in given list of String");
        String[] input_list = {"madaa","ab","aba"};
        System.out.println(Arrays.toString(getTotalMinCostForEachString(Arrays.asList(input_list)).toArray()));
    }
}
