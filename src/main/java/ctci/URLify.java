package ctci;

/**
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has suffucient space at the end to hold the additional characters,
 * ans that you are given the "true" length of the string.
 *
 * EXAMPLE :
 * Input : "Mr John Smith  ", 13
 * Output : "Mr%20John%20Smith"
 */

public class URLify {
    public static void main(String args[]){
        String inputString="Mr John Smith  ";
        String[] processedString=inputString.split(" ");
        StringBuffer outputStringBuffer = new StringBuffer();
        for(int i=0;i<=processedString.length-2;i++){
            outputStringBuffer.append(processedString[i]);
            outputStringBuffer.append("%20");
        }
        outputStringBuffer.append(processedString[processedString.length-1]);
        System.out.println("Output : ");
        System.out.println(outputStringBuffer);
    }
}
