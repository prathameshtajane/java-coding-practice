package stream_api_practice;

import java.util.Arrays;
import java.util.List;

/**
 * Add all the elements that are divisible by 5 using Stream API
 */

public class StreamAddDivisibleBy5Elements {
    public static void main(String args[]){
        List<Integer> numList = Arrays.asList(24,5,6,25);
        System.out.println(
        numList.stream()
                .filter(i -> {
                    if(i%5==0)
                        return true;
                    else
                        return false;
                })
                .reduce(0,(i,j)-> i+j)
        );
    }
}
