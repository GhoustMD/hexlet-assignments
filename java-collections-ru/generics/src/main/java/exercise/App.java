package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> dictionaty) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book: books) {
            boolean findBooks = true;

            for (Entry<String, String> item: dictionaty.entrySet()) {
                String bookValue = book.getOrDefault(item.getKey(), "");
                if (!bookValue.equals(item.getValue())) {
                    findBooks = false;
                }
            }

            if(findBooks){
                result.add(book);
            }
        }

        return result;
    }
}
//END
