package exercise;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertThat(App.take(numbers1, 0)).isEmpty();

        List<Integer> expecting1 = new ArrayList<>(Arrays.asList(1, 2));
        Assertions.assertThat(App.take(numbers1, 2)).isEqualTo(expecting1);

        List<Integer> expecting2 = new ArrayList<>(Arrays.asList(7, 3, 10));
        Assertions.assertThat(App.take(numbers2, 8)).isEqualTo(expecting2);

        // END
    }
}
