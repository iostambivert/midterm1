package midterm.tatia_iosebashvili_1.task4;
import java.util.*;
import java.util.HashSet;
import java.util.List;

public class WordStat {
        public static void printUniqueWords(List <String> words) {
            Set<String> printedWords = new HashSet<>();

            for (String word : words) {
                if (!printedWords.contains(word)) {
                    System.out.println(word);
                    printedWords.add(word);
                }
            }
    }
    public static Map<Integer, Integer> countWordLengths(List<String> words) {
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }
        return wordLengthCount;
    }

    public static void printWordLengthCount(Map<Integer, Integer> wordLengthCount) {
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Word Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Map<Integer, Integer> wordLengthCount = countWordLengths(fantasyFormatData);


        printUniqueWords(fantasyFormatData);
        printWordLengthCount(wordLengthCount);
    }

}
