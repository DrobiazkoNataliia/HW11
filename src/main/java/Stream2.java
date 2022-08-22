import java.util.Arrays;



public class Stream2 {

    public static void main(String[] args) {

        String[] array = {"John", "Bill", "Max", "Alex", "Anne", "Chris", "Dean", "Eve", "Fred", "George"};

                 Arrays.stream(array)
                .map(s -> s.toUpperCase())
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .forEach(System.out::println);
    }
}
