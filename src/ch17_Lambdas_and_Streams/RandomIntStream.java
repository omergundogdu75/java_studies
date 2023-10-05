package ch17_Lambdas_and_Streams;


import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomIntStream {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();

        // roll a die 60,000,000 times and summarize the results
        System.out.printf("%-6s%s%n", "Face", "Frequency");
        random.ints(60_000_000, 1, 7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .forEach((face, frequency) ->
                        System.out.printf("%-6d%d%n", face, frequency));

/*
        IntStream.iterate(1, x -> x + 1)
                .map(x -> x * x)
                .limit(10)
                .sum();

        IntStream.generate(() -> random.nextInt())
                .limit(10)
                .forEach(System.out::println);

        SecureRandom.ints()
                .limit(10)
                .forEach(System.out::println);
        */
    }
}
