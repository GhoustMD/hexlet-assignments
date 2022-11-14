package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {

    public static Map<String, Integer> getWordCount(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> dictionary = new HashMap<>();
        int length = sentence.length();

        if (length == 0) {
            return new HashMap<>();
        }

        for (String word: words){
            int count = dictionary.getOrDefault(word, 0) + 1;
            dictionary.put(word, count);
        }

        return dictionary;
    }

    public static String toString(Map<String, Integer> wordDictionary) {
        StringBuilder result = new StringBuilder();
        if (wordDictionary.size() == 0) {
            return "{}";
        }
        for(Map.Entry<String, Integer> word: wordDictionary.entrySet()) {
            result.append("  ").append(word.getKey()).append(": ").append(word.getValue()).append("\n");
        }
        return "{\n" + result + "}";
    }
}
//END
