package com.github.leosilvadev.biggest_number_java;

import org.junit.Test;

import java.util.PriorityQueue;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class PriorityAccumulatorTest {

    @Test
    public void mustAccumulateMaximumTwoNumbersWithHighestValues() {
        final var queue = new PriorityQueue<Integer>();
        final var accumulator = new PriorityAccumulator(2);

        IntStream.of(10, 5, 15, 20, 1).forEach(num -> accumulator.accept(queue, num));

        assertEquals(2, queue.size());
        assertEquals(Integer.valueOf(15), queue.poll());
        assertEquals(Integer.valueOf(20), queue.poll());
    }

}
