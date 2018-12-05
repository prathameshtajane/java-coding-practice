package daily_coding_challenges;

/**

 This problem was asked Microsoft.

 Using a read7() method that returns 7 characters from a file, implement readN(n) which reads n characters.

 For example, given a file with the content “Hello world”, three read7() returns “Hello w”, “orld” and then “”.

 */
public class Prob82_Read7 {

//    String inputString = "Hello World this is Prathamesh";
//    String inputString = "Hello";
    String inputString = "p";
    int call_count = 0;

    public String readMaxCount(int maxReadCharCount){
        String opString = null;
        if(maxReadCharCount * call_count > inputString.length()){
            opString = "";
        } else if(maxReadCharCount * call_count+maxReadCharCount > inputString.length()){
            opString = inputString.substring(maxReadCharCount * call_count,inputString.length());
        }else{
            opString = inputString.substring(maxReadCharCount * call_count,maxReadCharCount * call_count+maxReadCharCount);
        }
        call_count++;
        return opString;
    }

    public static void main(String args[]){
        Prob82_Read7 readOperations = new Prob82_Read7();
        System.out.println(readOperations.readMaxCount(7));
        System.out.println(readOperations.readMaxCount(7));
        System.out.println(readOperations.readMaxCount(7));
        System.out.println(readOperations.readMaxCount(7));
        System.out.println(readOperations.readMaxCount(7));
        System.out.println(readOperations.readMaxCount(7));


    }
}
