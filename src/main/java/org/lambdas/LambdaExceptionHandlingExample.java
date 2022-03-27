package org.lambdas;

import java.util.function.BiConsumer;

public class LambdaExceptionHandlingExample {

    public static void main(String[] args) {
        int[] searchNumbers = {1, 2, 3, 4};
        int key = 0;

        process(searchNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] searchArras, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : searchArras) {
            consumer.accept(i, key);
        }
    }

    public static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            } catch (ArithmeticException e) {
                System.out.println("Exception caught in wrapper lambda.");
            }
        };
    }
}
