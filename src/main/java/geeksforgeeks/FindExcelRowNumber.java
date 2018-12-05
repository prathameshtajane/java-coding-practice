package geeksforgeeks;

/*
    Given excel row as decimal number find corresponding number representation in excel row format.

    Algorithm :

    Time Complexity : O(n)

    step 1 : Variation of decimal number ot number with base 26

 */


public class FindExcelRowNumber {

    public static void findExcelRowNumber(int input_decimal_number){

        //edge case
        if(input_decimal_number <= 0){
            System.err.println("Wrong input");
        }

        StringBuffer excel_row = new StringBuffer();
        int num = input_decimal_number - 1;

        while (num >= 0){
            int char_ascii_value = (num % 26)+65;
            excel_row.append((char)char_ascii_value);
            num = (num/26)-1;
        }

        System.out.println("Excel Row Number :"+input_decimal_number);
        System.out.println("Excel Row Name :"+excel_row.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println("Find Excel Row number given decimal number");
        findExcelRowNumber(703);
        findExcelRowNumber(28);
        findExcelRowNumber(27);
        findExcelRowNumber(26);
    }
}
