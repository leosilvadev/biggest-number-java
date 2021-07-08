package com.github.leosilvadev.biggest_number_java;

import java.util.Queue;
import java.util.function.BiConsumer;

public class PriorityAccumulator implements BiConsumer<Queue<Integer>, Integer> {

    private final Integer limit;

    public PriorityAccumulator(final Integer limit) {
        this.limit = limit;
    }

    @Override
    public void accept(final Queue<Integer> queue, final Integer number) {
        queue.add(number);
        while (queue.size() > limit)
            queue.poll();
    }
}
