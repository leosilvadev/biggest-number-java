package com.github.leosilvadev.biggest_number_java;

import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class PriorityCombiner implements BinaryOperator<Queue<Integer>> {

    private final BiConsumer<Queue<Integer>, Integer> accumulator;

    public PriorityCombiner(final BiConsumer<Queue<Integer>, Integer> accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public Queue<Integer> apply(final Queue<Integer> q1, final Queue<Integer> q2) {
        q2.forEach(number -> accumulator.accept(q1, number));
        return q1;
    }
}
