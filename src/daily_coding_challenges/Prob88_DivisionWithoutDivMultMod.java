package daily_coding_challenges;


/*
This question was asked by ContextLogic.

Implement division of two positive integers without using the division, multiplication, or modulus operators.
Return the quotient as an integer, ignoring the remainder.


Algorithm :

    Assumption -
    The number we divide by.
    dividend ÷ divisor = quotient
    Example: in 12 ÷ 3 = 4, 3 is the divisor.
 */
public class Prob88_DivisionWithoutDivMultMod {

    public int divisionWithoutUsingMultDivMod(int dividend ,int divisor){
        if(divisor == 0){
            return Integer.MAX_VALUE;
        }

        if(divisor > dividend){
            return 0;
        }

        int remainder = dividend;
        int quotient = 0;
        while(remainder >= divisor){
            remainder = remainder - divisor;
            quotient++;
        }
        return quotient;
    }

    public static void main(String args[]){
        System.out.println("Prob88_DivisionWithoutDivMultMod");
        Prob88_DivisionWithoutDivMultMod pb88  = new Prob88_DivisionWithoutDivMultMod();
        System.out.println(pb88.divisionWithoutUsingMultDivMod(4,2));
        System.out.println(pb88.divisionWithoutUsingMultDivMod(17,2));
        System.out.println(pb88.divisionWithoutUsingMultDivMod(1,2));
        System.out.println(pb88.divisionWithoutUsingMultDivMod(2,0));

    }
}
