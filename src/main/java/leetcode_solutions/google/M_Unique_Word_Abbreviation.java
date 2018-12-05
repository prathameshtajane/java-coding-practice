package leetcode_solutions.google;

import java.util.HashSet;
import java.util.Set;

/**
 * An abbreviation of a word follows the form <first letter><number><last letter>.
 * Below are some examples of word abbreviations:

 a) it                      --> it    (no abbreviation)

 1
 ↓
 b) d|o|g                   --> d1g

               1    1  1
      1---5----0----5--8
      ↓   ↓    ↓    ↓  ↓
 c) i|nternationalizatio|n  --> i18n

               1
      1---5----0
      ↓   ↓    ↓
 d) l|ocalizatio|n          --> l10n
 Assume you have a dictionary and given a word, find whether its abbreviation is unique in the dictionary. A word's abbreviation is unique if no other word from the dictionary has the same abbreviation.

 Example:

 Given dictionary = [ "deer", "door", "cake", "card" ]

 isUnique("dear") -> false
 isUnique("cart") -> true
 isUnique("cane") -> false
 isUnique("make") -> true
 */
public class M_Unique_Word_Abbreviation {

    Set<String> hashSet = new HashSet<>();

    public M_Unique_Word_Abbreviation(String[] dictionary) {
        for(String eachString : dictionary){
            StringBuffer tempBuff = new StringBuffer();
            if(eachString.length() <= 2){
                hashSet.add(eachString);
                continue;
            }else{
                tempBuff.append(eachString.charAt(0));
                tempBuff.append(eachString.length()-2);
                tempBuff.append(eachString.charAt(eachString.length()-1));
                hashSet.add(tempBuff.toString());
            }
        }
    }

    public boolean isUnique(String word) {
        StringBuffer tempBuff = new StringBuffer();
        if(word.length() <= 2){
            return !hashSet.contains(word);
        }else{
            tempBuff.append(word.charAt(0));
            tempBuff.append(word.length()-2);
            tempBuff.append(word.charAt(word.length()-1));
            return !hashSet.contains(tempBuff.toString());
        }
    }


    public static void main(String args[]){
        System.out.println("Unique_Word_Abbreviation");
        String[] input = {"ValidWordAbbr","isUnique"};
        M_Unique_Word_Abbreviation uwa = new M_Unique_Word_Abbreviation(input);
//        System.out.println(uwa.isUnique("dear"));
//        System.out.println(uwa.isUnique("cart"));
//        System.out.println(uwa.isUnique("cane"));
//        System.out.println(uwa.isUnique("make"));
        System.out.println(uwa.isUnique("hello"));
        System.out.println(uwa.isUnique("hello"));
    }
}
