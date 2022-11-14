package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String charSequence, String word){
        List<Character> list = new ArrayList<>();
        char [] test = charSequence.toUpperCase().toCharArray();

        for(char c: word.toUpperCase().toCharArray()) {
            list.add(c);
        }

        for (char c2: test) {
            if (list.contains(c2)){
               list.remove(list.indexOf(c2));
            }
        }

        if (list.size() == 0) {
            return true;
        }

        return false;
    }

}

//END
