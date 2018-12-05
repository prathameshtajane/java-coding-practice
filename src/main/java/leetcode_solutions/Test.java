package leetcode_solutions;


import java.util.*;

public class Test {

    List<String> permutation(List<String> inputString) {
        List<String> outputList = new ArrayList<>();
        for(int i=0;i<inputString.size()-1;i++){
            char[] str1 = inputString.get(i).toCharArray();
            Arrays.sort(str1);
            String String1 = new String(str1);
            for(int j=i+1;j<inputString.size();j++){
                char[] str2 = inputString.get(j).toCharArray();
                Arrays.sort(str2);
                String String2 = new String(str2);
                if(String1.equals(String2)){
                    outputList.add(inputString.get(i));
                    outputList.add(inputString.get(j));
                }
            }
        }
        return outputList;
    }

    Map<String,Integer> permutationMap(List<String> inputString) {
        List<String> outputList = new ArrayList<>();
        List<String> visited = new ArrayList<>();
        Map<String,Integer> opMap = new HashMap<>();
        for (int i = 0; i < inputString.size() - 1; i++) {
            char[] str1 = inputString.get(i).toCharArray();
            Arrays.sort(str1);
            String String1 = new String(str1);

            if(visited.contains(inputString.get(i))){
                continue;
            }
            ArrayList<String> tempList=new ArrayList<>();
            for (int j = i + 1; j < inputString.size(); j++) {
                char[] str2 = inputString.get(j).toCharArray();
                Arrays.sort(str2);
                String String2 = new String(str2);
                tempList = new ArrayList<>();
                if (String1.equals(String2)) {
//                    outputList.add(inputString.get(i));
//                    outputList.add(inputString.get(j));
                    tempList.add(inputString.get(j));
                    visited.add(inputString.get(j));
                }
            }
            int size = tempList.size()+1;
            opMap.put(inputString.get(i),size);
            for(String each : tempList){
                opMap.put(each,size);
            }

        }
        return opMap;
    }

    List<Long> permutationUtil(List<String> sentences,List<String> outputList){
        List<Long> countList = new ArrayList<>();
        for(String eachSentence : sentences){
            String[] senteneArray = eachSentence.split(" ");
            ArrayList<String> sentenceList=new ArrayList<>(Arrays.asList(senteneArray));
            sentenceList.retainAll(outputList);
            int size = sentenceList.size();
            countList.add((long)Math.pow(2,size));
        }
        return countList;
    }



    List<Long> permutationUtilMap(List<String> sentences,HashMap<String, Integer> outputMap){
        List<Long> countList = new ArrayList<>();
        for(String eachSentence : sentences){
            String[] senteneArray = eachSentence.split(" ");
            ArrayList<String> sentenceList=new ArrayList<>(Arrays.asList(senteneArray));
//            for () {
//
//            }
//            sentenceList.retainAll(outputList);
            int size = sentenceList.size();
            countList.add((long)Math.pow(2,size));
        }
        return countList;
    }

    List<Long> driverProgram(List<String> testInputs, List<String> sentences){
//        Test t = new Test();
//        return t.permutationUtil(sentences,t.permutation(testInputs));
        return permutationUtil(sentences,permutation(testInputs));
    }



    public static void main(String args[]){
        System.out.println("Test");
        Test t = new Test();
        ArrayList<String> testInput = new ArrayList<>();
        testInput.add("cat");
        testInput.add("is");
        testInput.add("at");
        testInput.add("act");

        String str1 = "act it is cat";
        String str2 = "act it is";
        ArrayList<String> sentences = new ArrayList<>();
        sentences.add(str1);
        sentences.add(str2);

//        t.permutationUtil(sentences,t.permutation(testInput));
        t.driverProgram(testInput,sentences);
    }
}
