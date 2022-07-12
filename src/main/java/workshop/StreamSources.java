package workshop;

import java.util.stream.Stream;

public class StreamSources {
    public static Stream<String> stringNumbersStream() {
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> intNumbersStream() {
        return Stream.iterate(0, integer -> integer + 2)
                .limit(10);
    }

    public static Stream<User> userStream() {
        return Stream.of(
                new User(1, "Elvis", "Presley"),
                new User(2, "Mike", "Bisping"),
                new User(2, "Khamzat", "Chimaev"),
                new User(4, "Gilbert", "Burns"),
                new User(5, "Alex", "Volkanovski"),
                new User(6, "Max", "Holloway")
        );
    }
}
