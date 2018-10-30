package ctci;
import static java.util.Arrays.sort;

/**
 *  Given two strings,write a method to decide if one is a permutation of the other.
 */
public class Is_Permutation {
    public static void main(String args[]){
        String stringOne="god1";
        String stringTwo="dog1";
        char[] stringOneArray=stringOne.toCharArray();
        char[] stringTwoArray=stringTwo.toCharArray();
        sort(stringOneArray);
        sort(stringTwoArray);
        System.out.println(new String(stringOneArray).equals(new String(stringTwoArray)));
    }
}
