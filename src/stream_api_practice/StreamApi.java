package stream_api_practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

import static java.util.stream.Collectors.toList;

public class StreamApi {

    public static int doubleit(int i){
        System.out.println(i*2);
        return i*2;
    }

    public static void main(String args[]){
        System.out.println("StreamApi Practice");
        List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Lambda Function :");
        numList.forEach(i -> System.out.println(i));


        System.out.println("With Consumer Interface and Anonymous function");
        Consumer<Integer> c = (Integer i) ->{
            System.out.println(i);
        };
        numList.forEach(c);

        System.out.println("Call by Method reference : part 1");
        numList.forEach(System.out :: println);

        System.out.println("Call by Method reference : part 2");
        numList.forEach(i -> StreamApi.doubleit(i));
        numList.forEach(System.out::println);

        System.out.println("Using STREAM API :");
        numList.stream().forEach(System.out::println);


        System.out.println("Using STREAM API : filter()");
        numList.stream()
                .filter(i -> {
                    if(i%2==0)
                        return true;
                    else
                        return false;
                })
                .forEach(System.out::println);

        System.out.println("Using STREAM API : findFirst()");
        System.out.println(
                numList.stream()
                .filter(i -> {
                    if(i%2==0)
                        return true;
                    else
                        return false;
                })
                .findFirst().orElse(0)
        );

        System.out.println("Using STREAM API : Adding all the values given in List");
        /*
            Mutation is bad for program efficiency.
            Here we are mutating(Changing) value of 'result' variable.
         */

        final int[] result = {0};
        numList.forEach(i -> {
            result[0] += i;
        });
        System.out.println(result[0]);


        System.out.println("Using STREAM API : Multiplying all the values given in List(using map())");
        numList.stream()
                .map(i -> i*2)
                .forEach(System.out::println);


        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };


        System.out.println("Using STREAM API : Adding all the values given in List(using map() and reduce())");
        System.out.println(
        numList.stream()
                .reduce(0,b)
        );

        System.out.println(
        numList.stream()
                .reduce(1,(int1,int2)->int1+int2)
        );


        System.out.println("Using STREAM API : Adding all the values divisible by 5given in List(using map() and reduce())");
        System.out.println(
        numList.stream()
                .filter(i -> (i%5==0))
                .reduce(0,(int1,int2)->(int1+int2))
        );

        System.out.println("Using STREAM API : Collect()");
        List<Integer> result2 = numList.stream()
                        .filter(i -> (i%5==0))
                        .collect(toList());
        System.out.println(Arrays.toString(result2.toArray()));


        System.out.println("Using STREAM API : flatMap()");
        List<List<String>> charList = Arrays.asList(
                Arrays.asList("a"),
                Arrays.asList("b"));
        System.out.println(charList);

        List<String> charArray = charList.stream()
                                        .flatMap(Collection::stream)
                                        .map((i) -> (i+'c'))
                                        .collect(toList());

        System.out.println(charArray);
    }
}
