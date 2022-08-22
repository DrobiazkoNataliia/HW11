import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream4 {
    public static long a = 25214903917L;
    public static long c = 11L;
    public static long m = 281474976710656L;
    public static long seed = 1L;
    public static long getRand() {
        seed = (a * seed + c) % m;
        return seed;
    }
    public static void main(String[] asgs) {
        Stream4 s = new Stream4();
        Stream<Long> stream = (Stream<Long>) Stream.iterate(seed, (seed) -> s.getRand());
        stream.limit(10).peek(System.out::println).collect(Collectors.toList());
    }
}
