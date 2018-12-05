package leetcode_solutions;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by prathamesh on 9/19/18.
 * each line of the new file should list words from the input line in reverse order.
 * For instance, if the line in  the input file contained text "I had a dream" the corresponding output
 * file line should be "dream a had I".
 */
public class ReverseLineInArray {


    static String reversedSentence(String sentence) {
        List<String> wordList = Arrays.asList(sentence.split(" "));

        List<String> ReversedList = new ArrayList<>();

        wordList.stream()
                .collect(Collectors.toCollection(ArrayDeque::new)) // or LinkedList
                .descendingIterator()
                .forEachRemaining(i -> ReversedList.add(i));

//        System.out.println(String.join(" ",ReversedList));
        return String.join(" ",ReversedList);
    }


    public static void main(String args[]) {
        System.out.println("ReverseLineInArray");
        List<String> testInputString = Arrays.asList("prathamesh", "tajane");
//        System.out.println(String.join(" ",testInputString));
        System.out.println(ReverseLineInArray.reversedSentence("prathamesh kisan tajane"));
        System.out.println(ReverseLineInArray.reversedSentence("prathamesh tajane"));
        System.out.println(ReverseLineInArray.reversedSentence("prathamesh"));
    }
}
