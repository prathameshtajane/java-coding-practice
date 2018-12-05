package ctci;

/**
 * Adding binary numbers
 */

public class AddBinaryNumbers {

    public static void addBinaryNumbers(int firstNum, int secndNum){
        int sum = firstNum+secndNum;
        System.out.println(sum);
    }
    public static void main(String args[]){
        String firstNumber = "111";
        String secondNumber = "110";
        int sum=Integer.parseInt(firstNumber,2)+Integer.parseInt(secondNumber,2);
        System.out.println(Integer.toString(sum,2));
    }
}
