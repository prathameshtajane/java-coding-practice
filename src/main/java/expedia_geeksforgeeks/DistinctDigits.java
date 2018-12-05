package expedia_geeksforgeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a range [m,n] ,
 * print the count of numbers having distinct digits.
 * For eg, 12 is said to have all digits distinct while 121 is not.
 */
public class DistinctDigits {
    public static void main(String args[]){
        int startNumber=100;
        int endNumber=200;
        int distinctNumberCount=0;
        for(int i = startNumber;i<=endNumber;i++){
            int  eachValue = i;
            /**
             * Main Logic of identifying if the arrayList has duplicate elements in it.
             */
            List<Integer> withDupNumbers = new ArrayList<>();
            Set<Integer> withoutDupsNumbers;
            while(eachValue > 0){
                withDupNumbers.add(eachValue%10);
                eachValue=eachValue/10;
            }
            withoutDupsNumbers = new HashSet<>(withDupNumbers);
            if(withDupNumbers.size() == withoutDupsNumbers.size()){
                distinctNumberCount++;
            }
        }
        System.out.println(distinctNumberCount);
    }
}
