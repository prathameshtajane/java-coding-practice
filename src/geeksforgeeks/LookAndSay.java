package geeksforgeeks;

/*
    Given a string "aaabbbcc", compress it, = "a3b3c2
 */

public class LookAndSay {

    private static String lookAnsSay(String input_string){
        int count = 1;
        StringBuffer op_str_buff = new StringBuffer();

        //edge case
        if(input_string.length() == 1){
            op_str_buff.append(input_string);
            op_str_buff.append(count);
            return op_str_buff.toString();
        }
        for(int i = 0 ; i < input_string.length()-1 ; i++){
            if(i == input_string.length()-2){
                if(input_string.charAt(i) == input_string.charAt(i+1)){
                    ++count;
                    op_str_buff.append(input_string.charAt(i));
                    op_str_buff.append(count);
                    count = 1;
                }else{
                    op_str_buff.append(input_string.charAt(i));
                    op_str_buff.append(count);
                    count = 1;
                    op_str_buff.append(input_string.charAt(i+1));
                    op_str_buff.append(count);
                    count = 1;
                }
            }else if(input_string.charAt(i) == input_string.charAt(i+1)){
                ++count;
            }else{
                op_str_buff.append(input_string.charAt(i));
                op_str_buff.append(count);
                count=1;
            }
        }
        return op_str_buff.toString();
    }

    public static void main(String[] args) {
        System.out.println("Look and Say - similar to String Compression");
        System.out.println(lookAnsSay("aabcccccaaa"));
        System.out.println(lookAnsSay("aabcccccaab"));
        System.out.println(lookAnsSay("aa"));
        System.out.println(lookAnsSay("a"));
    }
}
