package appfolio;


/*
Expected Time Complexity : O(n)
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePrimeNumbers {

    private static boolean isSatisyCondition(int n){
        for (int i = 2; i*i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static List<Integer> generatePrimeNumbers(int n){
        List<Integer> prime_numbers_list = new ArrayList<>();
        if(n >= 2){
            prime_numbers_list.add(2);
        }
        for(int i = 3 ; i <=n ; i+=2){
            if(isSatisyCondition(i)){
                prime_numbers_list.add(i);
            }
        }
        return prime_numbers_list;
    }

    public static void main(String[] args) {
        System.out.println("Generate Prime Numbers from  1 to n");
        System.out.println(Arrays.toString(generatePrimeNumbers(100000).toArray()));
    }
}
