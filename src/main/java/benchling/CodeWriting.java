package benchling;

import java.util.HashSet;
import java.util.Set;

public class CodeWriting {
    int minimumGeneticMutation(String startStr, String endStr, String[] bank) {
        int geneMutationCount = 0;
        Set<String> bankSet = new HashSet<>();
        for(String word : bank){
            bankSet.add(word);
        }
        if(!bankSet.contains(endStr)){
            return geneMutationCount;
        }
        char[] validCharArr = {'A', 'C', 'G', 'T'};
        Set<String> reached = new HashSet<>();
        reached.add(startStr);
        ++geneMutationCount;


        while(!reached.contains(endStr)){
            Set<String> addSet = new HashSet<>();
            for(String word : reached){
                for(int i = 0 ; i < word.length() ; i++){
                    char[] currWordArr = word.toCharArray();
                    for(char validChar : validCharArr){
                        currWordArr[i]=validChar;
                        if(bankSet.contains(new String(currWordArr))){
                            addSet.add(new String(currWordArr));
                            bankSet.remove(new String(currWordArr));
                        }
                    }
                }
            }

            ++geneMutationCount;
            if(addSet.size() == 0){
                return 0;
            }
            reached=addSet;
        }
        return geneMutationCount;
    }
}
