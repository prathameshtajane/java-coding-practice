package leetcode_solutions;

public class E_Amazon_Calculate_number_of_zero_in_integer {

    int getNumberOfZerosInInteger(int num){
        int zeroCount = 0;
        if(num<0){
            num=0-num;
        }
        while(num > 0){
            zeroCount = (num%10==0)?zeroCount+1:zeroCount;
            num /= 10;
        }
        return zeroCount;
    }
}
