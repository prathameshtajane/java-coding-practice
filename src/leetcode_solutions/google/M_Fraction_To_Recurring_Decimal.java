package leetcode_solutions.google;

import java.util.HashMap;

/**
     Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
     If the fractional part is repeating, enclose the repeating part in parentheses.

     Example 1:

     Input: numerator = 1, denominator = 2
     Output: "0.5"
     Example 2:

     Input: numerator = 2, denominator = 1
     Output: "2"
     Example 3:

     Input: numerator = 2, denominator = 3
     Output: "0.(6)"
 */
public class M_Fraction_To_Recurring_Decimal{

    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0){
            return "";
        }

        //create String Buffer
        StringBuffer res = new StringBuffer();

        //decide res is + of -
        String sign = ((numerator > 0) ^ (denominator > 0) ? "-" : "");
        res.append(sign);

        long unsignedNumerator = Math.abs((long) numerator);
        long unsignedDenomrator = Math.abs((long) denominator);

        //adding quotient
        long quot = unsignedNumerator/unsignedDenomrator;
        res.append(quot);

        long num = unsignedNumerator%unsignedDenomrator;

        //checing if fraction present
        if(unsignedNumerator%unsignedDenomrator == 0){
            return res.toString();
        }

        //adding fraction point
        res.append(".");

        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / unsignedDenomrator);
            num %= unsignedDenomrator;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, "(");
                res.append(")");
                break;
            }
            else {
                map.put(num, res.length());
            }
        }
        return res.toString();

    }

    public static void main(String args[]){
        System.out.println("M_Fraction_To_Recurring_Decimal");
        M_Fraction_To_Recurring_Decimal mrd = new M_Fraction_To_Recurring_Decimal();
        System.out.println(mrd.fractionToDecimal(-1,-2));
        System.out.println(mrd.fractionToDecimal(-1,-3));
    }
}
