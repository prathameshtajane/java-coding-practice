package ctci;
import java.util.HashMap;

/**
 * Created by prathamesh on 1/21/18.
 */
public class StringCompression {
    public static void main(String args[]){
        String inputString = "aabcccccaaaaaaaaaa";
        HashMap<Character,Integer> inputStringHashMap = new HashMap<Character,Integer>();
        for(char eachChar : inputString.toCharArray()){
            if(inputStringHashMap.containsKey(eachChar)){
                int count=inputStringHashMap.get(eachChar);
                count+=1;
                inputStringHashMap.put(eachChar,count);
            }else {
                inputStringHashMap.put(eachChar,1);
            }
        }
        StringBuffer outputString = new StringBuffer();
        for(Character key : inputStringHashMap.keySet()){
            outputString.append(key);
            outputString.append(inputStringHashMap.get(key));
        }

        if(outputString.length() > inputString.length()){
            System.out.println(inputString);
        }else{
            System.out.println(outputString);
        }
    }
}
