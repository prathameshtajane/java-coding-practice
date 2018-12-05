package leetcode_solutions.google;

import java.util.HashMap;

/**
 * 171. Excel Sheet Column Number

     Given a column title as appear in an Excel sheet, return its corresponding column number.

     For example:

     A -> 1
     B -> 2
     C -> 3
     ...
     Z -> 26
     AA -> 27
     AB -> 28
     ...

     Example 1:

     Input: "A"
     Output: 1
     Example 2:

     Input: "AB"
     Output: 28
     Example 3:

     Input: "ZY"
     Output: 701
 */
public class Excel_Sheet_Column_Number {

    public int titleToNumber(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
        double result = 0;

        for(char i = 'A' ; i <= 'Z' ; i++){
            map.put(i,(int)i-64);
        }

        char[] inputCharArray = s.toCharArray();

        int expoCount = 0;
        for(int i = inputCharArray.length-1;i>=0;i--){
            result += map.get(inputCharArray[i])*Math.pow(26,expoCount++);
        }

        return (int)result;
    }

    public static void main(String args[]){
        System.out.println("Excel_Sheet_Column_Number");
        Excel_Sheet_Column_Number ColNum = new Excel_Sheet_Column_Number();
        System.out.println(ColNum.titleToNumber("A"));
        System.out.println(ColNum.titleToNumber("AB"));
        System.out.println(ColNum.titleToNumber("ZY"));
        System.out.println(ColNum.titleToNumber("AAA"));
        System.out.println(ColNum.titleToNumber("ZA"));
    }
}
