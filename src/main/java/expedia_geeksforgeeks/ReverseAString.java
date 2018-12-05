package expedia_geeksforgeeks;

/**
 * Reverse a String
 */
public class ReverseAString {
    public static void main(String args[]){
        String inputStrting = "Sky   is blue";
        String[] inputStringArray = inputStrting.split(" ");
        StringBuffer opString = new StringBuffer();
        for(int i = inputStringArray.length-1;i>=0;i--){
            opString.append(inputStringArray[i]);
            opString.append(" ");
        }
        opString.deleteCharAt(opString.lastIndexOf(" "));
        System.out.println(opString);
    }
}
