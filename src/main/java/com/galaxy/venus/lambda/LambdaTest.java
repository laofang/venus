package com.galaxy.venus.lambda;

import java.util.function.Consumer;

public class LambdaTest {

    public static void main(String[] args) {
        add(p-> System.out.println(p + 10));
    }


    public static void add(Consumer<Integer> consumer) {
        consumer.accept(10);
    }
}
