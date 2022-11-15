package exercise;

import java.util.Arrays;

// BEGIN
public class App {
    public static String[] duplicateItems(String[] items) {
        return Arrays.stream(items)
                .flatMap(item -> Arrays.stream(new String[] {item, item}))
                .toArray(String[]::new);
    }

    public static String[][] enlargeArrayImage(String[][] image){
        String[][] horizontalLine = Arrays.stream(image)
                .map(App::duplicateItems)
                .toArray(String[][]::new);

        return Arrays.stream(horizontalLine)
                .flatMap(item -> Arrays.stream( new String[][] {item, item}))
                .toArray(String[][]::new);
    }
}
// END
