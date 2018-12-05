package leetcode_solutions;

public class ReverseString {

    public String reverseString(String s) {
        if(s.length() == 1 || s.length() == 0){
            return s;
        }
        char[] inputString = s.toCharArray();
        for(int i = 0,j=inputString.length-1;i<(inputString.length/2);i++,j--){
            char temp = inputString[i];
            inputString[i]=inputString[j];
            inputString[j]=temp;
        }
        String opString = new String(inputString);
        return opString;
    }

    public static void main(String args[]){
        System.out.println("Reverse String");
        ReverseString RS = new ReverseString();
        System.out.println(RS.reverseString(""));
    }
}
