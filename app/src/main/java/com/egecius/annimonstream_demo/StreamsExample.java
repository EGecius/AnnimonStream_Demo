package com.egecius.annimonstream_demo;

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
}
