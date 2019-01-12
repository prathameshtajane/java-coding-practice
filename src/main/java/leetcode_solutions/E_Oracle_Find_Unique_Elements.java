package leetcode_solutions;

public class E_Oracle_Find_Unique_Elements {

    String getListOfUniqueCharacters(String input){
        StringBuilder outputList = new StringBuilder();
        if(input == null){
            return null;
        }
        int[] charCount = new int[256];

        for(char c : input.toCharArray()){
            charCount[(int)c]++;
        }

        for(int i = 0 ; i < charCount.length ; i++){
            if(charCount[i] == 1){
                outputList.append((char)i);
            }
        }

        return outputList.toString();
    }
}
