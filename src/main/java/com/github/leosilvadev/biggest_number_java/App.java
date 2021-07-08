package com.github.leosilvadev.biggest_number_java;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class App {

    public static void main(final String[] args) {
        if (args.length != 2)
            throw new IllegalArgumentException("Two arguments must be provided: totalOfRandomNumbers and totalOfBiggestNumbers, in that order.");

        final var totalOfRandomNumbers = Long.parseLong(args[0]);
        final var totalOfBiggestNumbers = Integer.parseInt(args[1]);

        final var random = new Random();

        System.out.printf("Generating %s random numbers in memory...\n", totalOfRandomNumbers);
        final var sAt = System.currentTimeMillis();
        final var numbers = LongStream.range(0, totalOfRandomNumbers).boxed().map(i -> random.nextInt(10_000)).collect(Collectors.toList());
        final var eAt = System.currentTimeMillis();

        final var startedAt = System.currentTimeMillis();
        System.out.printf("Getting %s biggest numbers from %s numbers \n", totalOfBiggestNumbers, totalOfRandomNumbers);
        final var biggest = new Numbers(numbers).biggest(totalOfBiggestNumbers);
        final var endedAt = System.currentTimeMillis();

        System.out.printf("App setup executed in %s milliseconds \n", eAt - sAt);
        System.out.printf("App logic executed in %s milliseconds \n", endedAt - startedAt);
        System.out.println(biggest);
    }

}
