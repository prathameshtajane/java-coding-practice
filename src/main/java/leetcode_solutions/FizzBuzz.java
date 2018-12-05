package leetcode_solutions;

/**
 * FizzBuzz problem
 */
public class FizzBuzz {
    public static String fizzbuzz(int i){
        if(i % 15 == 0){
            return "FizzBuzz";
        }else if(i % 5 == 0){
            return "Buzz";
        }else if(i % 3 == 0){
            return "Fizz";
        }else{
            return Integer.toString(i);
        }
    }

    public static void main(String args[]){
        int end = 20;
        for(int i =1;i<=end;i++){
            System.out.println(fizzbuzz(i));
        }
    }
}
