package com.github.leosilvadev.biggest_number_java;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collector;

public class Numbers {

    private final List<Integer> numbers;

    public Numbers(final List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Integer> biggest(final Integer limit) {
        return numbers.stream().collect(priorityCollectorWith(new PriorityAccumulator(limit), limit));
    }

    private Collector<Integer, Queue<Integer>, List<Integer>> priorityCollectorWith(
            final BiConsumer<Queue<Integer>, Integer> accumulator,
            final Integer limit
    ) {
        return Collector.of(
                () -> new PriorityQueue<>(limit + 1, Comparator.naturalOrder()),
                accumulator,
                new PriorityCombiner(accumulator),
                ArrayList::new
        );
    }

}
