package exercise;

import java.util.List;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> emails) {
        if (emails != null) {
            return (int) emails.stream()
                    .filter(email -> email.contains("@gmail.com") || email.contains("@yandex.ru") || email.contains("@hotmail.com"))
                    .count();
        }
        else {
            return 0;
        }
    }
}
// END
