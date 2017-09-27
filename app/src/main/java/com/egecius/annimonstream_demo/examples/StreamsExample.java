package com.egecius.annimonstream_demo.examples;

import com.annimon.stream.Optional;
import com.annimon.stream.Stream;

import java.util.List;

public class StreamsExample {

    private int counter = 0;

    List<String> sortFilerAndMap(List<Integer> list) {

        return Stream.of(list)
                .sorted()
                .filter(integer -> integer < 10)
                .map(String::valueOf)
                .toList();
    }

    void forEach(List<Integer> list) {
        Stream.of(list)
                .forEach(integer -> incrementCounter());
    }

    private void incrementCounter() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    /** Returns only distinct values, based on equals() and hashmap() */
    public List<Integer> distinct(List<Integer> integers) {
        return Stream.of(integers)
                .distinct()
                .toList();
    }

    /** findFirst() returns first found value
     * If not found, returns Optional.empty()
     * */
    public Optional<Integer> findFirst(List<Integer> integers) {
        return Stream.of(integers)
                .findFirst();
    }
}
