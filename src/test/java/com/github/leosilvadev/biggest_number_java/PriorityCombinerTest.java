package com.github.leosilvadev.biggest_number_java;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class PriorityCombinerTest {

    @Test
    public void mustCombineTwoQueuesAndKeepTheMaxNumberOfNumbersWithHighestValue() {
        final var firstQueue = new PriorityQueue<Integer>();
        IntStream.range(1, 11).boxed().forEach(firstQueue::add);

        final var secondQueue = new PriorityQueue<Integer>();
        IntStream.range(11, 21).boxed().forEach(secondQueue::add);

        final var accumulator = new PriorityAccumulator(2);
        final var combiner = new PriorityCombiner(accumulator);

        final var finalQueue = combiner.apply(firstQueue, secondQueue);

        assertEquals(2, finalQueue.size());
        assertEquals(Integer.valueOf(19), finalQueue.poll());
        assertEquals(Integer.valueOf(20), finalQueue.poll());
    }
}
