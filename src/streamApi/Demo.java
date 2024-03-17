package streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4,10,7,8,9);
//        Stream<Integer> data = nums.stream().map(n -> n*2);
//        Stream<Integer> sortedData = data.sorted();
//        Stream<Integer> doubleData = data.map(n -> n*2);

//        Predicate<Integer> test = n ->  n%2==1;

        Function<Integer, Integer> f = new Function() {
            @Override
            public Object apply(Object o) {
                return null;
            }
        };
        int result = nums.stream()
                .filter(n ->  n%2==1)
                .map(n -> n*2)
                .reduce(0, (c,e) -> c+e );// We can use the stream only once.

        System.out.println(result);
    }
}
