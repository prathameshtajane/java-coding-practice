

public class SentenceWithMaxWords {

    public int solution(String s){

        String[] sentences = s.split("[\\.\\?\\!]");
        int maxCount = 0;
        for(String sentence : sentences){
            String tempString = sentence.replaceAll("\\s+"," ").trim();
            if(tempString.split(" ").length > maxCount){
                maxCount = tempString.split(" ").length;
            }
        }
        return maxCount;
    }

    public static void main(String args[]){
        SentenceWithMaxWords s = new SentenceWithMaxWords();
//        String input1 = "We test coders. Give us a try? ";
//        String input1 = "ptajane.gmail.com";
        String input1 = ".";
//        String input1 = "Forget   CVs..Save time . x    n x! . . .";
//        String input1 = ".!?";
//        String input1 = "Somewhere along the way, this double-barreled typographical starlet lost its momentum and found its way into the ‘Where Are They Now?’ file.” Maynard talks with Penny Speckter, the widow of the interrobang’s creator, ad executive Martin K. Speckter, about typography in the 1960s and her husband’s enthusiasm for the ‽.";

        System.out.println(s.solution(input1));
    }
}
