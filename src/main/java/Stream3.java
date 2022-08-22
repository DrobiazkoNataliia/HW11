import java.util.Arrays;
import java.util.stream.Collectors;

public class Stream3 {

    public static void main(String[] args) {

        String[] str = {"1, 2, 0", "4, 5"};

        String[] str2 = str[0].replaceAll(",", "").split(" ");
        String[] str3 = str[1].replaceAll(",", "").split(" ");

        String[] array = new String[str2.length + str3.length];

        System.arraycopy(str2, 0, array, 0, str2.length);
        System.arraycopy(str3, 0, array, str2.length, str3.length);

        System.out.println(Arrays.stream(array)
                .map(Integer::parseInt)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "))
        );
    }
}


