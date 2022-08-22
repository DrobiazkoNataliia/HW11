import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream5 {

    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("John", "Bill", "Max", "Alex", "Anne", "Chris", "Dean", "Eve", "Fred", "George");
        Stream<String> streamB = Stream.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        Stream<String> result = zip(streamA, streamB);

        result.peek(System.out::println).collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> streamA, Stream<T> streamB) {
        List<T> streamAItems = streamA.collect(Collectors.toList());
        List<T> streamBItems = streamB.collect(Collectors.toList());
        int minSize = Math.min(streamAItems.size(), streamAItems.size());
        List<T> resultList = new ArrayList<>();
        for (int i = 0; i < minSize; i++) {
            resultList.add(streamAItems.get(i));
            resultList.add(streamBItems.get(i));
        }
        return resultList.stream();

    }
}
