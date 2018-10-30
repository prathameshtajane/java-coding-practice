package goldman_sachs;


import java.util.Collections;
import java.util.HashMap;

public class ThePerfectTeam {
    static int differentTeams(String skills) {
        char[] skillsCharArray = skills.toCharArray();
        HashMap<Character,Integer> charCountMap = new HashMap();
        for(char eachChar : skillsCharArray){
            if(!charCountMap.containsKey(eachChar)){
                charCountMap.put(eachChar,1);
            }else{
                charCountMap.put(eachChar,charCountMap.get(eachChar)+1);
            }
        }
        return (charCountMap.size() < 5) ? 0 : Collections.min(charCountMap.values());
    }
}
