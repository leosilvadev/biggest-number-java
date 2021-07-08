package com.github.leosilvadev.biggest_number_java;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class NumbersTest {

    @Test
    public void mustGetTwoBiggestNumbersFromAThousand() {
        final var aThousandNumbers = IntStream.range(1, 1_001).boxed().collect(Collectors.toList());
        final var numbers = new Numbers(aThousandNumbers);

        final var biggestNumbers = numbers.biggest(2);

        assertEquals(2, biggestNumbers.size());
        assertEquals(Integer.valueOf(1_000), biggestNumbers.get(1));
        assertEquals(Integer.valueOf(999), biggestNumbers.get(0));
    }

}
