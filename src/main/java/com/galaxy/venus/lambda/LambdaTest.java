package com.galaxy.venus.lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaTest {

    public static void main(String[] args) {
        add(p-> System.out.println(p + 10));
        System.out.println(modify(x-> x + 10 + ""));
    }


    public static void add(Consumer<Integer> consumer) {
        consumer.accept(10);
    }


    public static String modify(Function<Integer,String> function) {
        return function.apply(10);
    }
}
