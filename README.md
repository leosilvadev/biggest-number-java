# Biggest number - Java

This code aims to get the biggest N numbers from a given list of numbers.
In order to make it easier to run all the numbers used are randomly generated.

The solution implemented is using a Priority Queue to accumulate the numbers, 
keeping just the biggest N numbers (priority is defined by the value of the number, bigger == more priority).


```bash
./gradlew test
```

# How to run the tests

```bash
./gradlew test
```

# How to run the application

```bash
TOTAL_OF_NUMBERS=100000000
TOTAL_OF_BIGGEST_NUMBERS=2
./gradlew run --args="$TOTAL_OF_NUMBERS $TOTAL_OF_BIGGEST_NUMBERS"
```