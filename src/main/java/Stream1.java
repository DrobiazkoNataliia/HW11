import java.util.stream.IntStream;

public class Stream1 {

    public static void main(String[] args) {

        String[] array = {"John", "Bill", "Max", "Alex", "Anne", "Chris", "Dean", "Eve", "Fred", "George"};

        IntStream.range(0, array.length)
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> String.format("%d. %s", index, array[index]))
                .forEach(System.out::println);
    }
}



