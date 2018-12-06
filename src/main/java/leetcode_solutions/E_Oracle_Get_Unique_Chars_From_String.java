package leetcode_solutions;

import java.util.*;

public class E_Oracle_Get_Unique_Chars_From_String {
    public List<String> getUniqueCharsFromString(String inp_str){
        int[] char_count = new int[256];
        List<String> unique_char_list = new ArrayList<>();

        //O(n)
        for(char ch : inp_str.toCharArray())
            char_count[(int)ch]+=1;

        //O(1)
        for(int i = 0 ; i < char_count.length ; i++){
            if(char_count[i]==1)
                unique_char_list.add(((char)i)+"");
        }
        return unique_char_list;
    }
}
