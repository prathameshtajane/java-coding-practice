package twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextQueries1 {
    static void textQueries(List<String> sentences, List<String> queries) {

        List<Map<String, Integer>> referenceMap = new ArrayList<>();

        for (int i = 0; i < sentences.size(); i++) {
            Map<String, Integer> map = new HashMap<>();
            String[] sentenceWords = sentences.get(i).split(" ");
            for (String word : sentenceWords) {
                if (map.containsKey(word)) {
                    int count = map.get(word);
                    map.put(word, count++);
                } else {
                    map.put(word, 1);
                }
            }
            referenceMap.add(map);
        }

        for (String query : queries) {
            int count = -1;
            boolean isPrinted = false;
            String[] qWords = query.split(" ");
            for (int j = 0; j < sentences.size(); j++) {
                for (String qWord : qWords) {
                    count = -1;
                    int occurence = 0;
                    if (referenceMap.get(j).containsKey(qWord)) {
                        occurence = referenceMap.get(j).get(qWord);
                    } else {
                        occurence = 0;
                    }
                    if (occurence > 0) {
                        if (count == -1) {
                            count = occurence;
                        } else {
                            count = Math.min(occurence, count);
                        }
                    } else {
                        count = -1;
                        break;
                    }
                }
                if (count > 0) {
                    isPrinted = true;
                    for (int l = 0; l < count; l++) {
                        System.out.print(j + " ");
                    }
                }
            }
            if (count == -1 && !isPrinted) {
                System.out.print("-1");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<String> sentences = new ArrayList<>();
        sentences.add("jim likes mary");
        sentences.add("kate likes tom");
        sentences.add("tom does not like jim");

        List<String> queries = new ArrayList<>();
        queries.add("neha");
        queries.add("likes");
        textQueries(sentences, queries);

    }
}

