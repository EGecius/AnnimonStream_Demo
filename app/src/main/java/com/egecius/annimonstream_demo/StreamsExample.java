package com.egecius.annimonstream_demo;

import com.annimon.stream.Stream;

import java.util.List;

public class StreamsExample {

    List<String> sortFilerAndMap(List<Integer> list) {

        return Stream.of(list)
                .sorted()
                .filter(integer -> integer < 10)
                .map(String::valueOf)
                .toList();
    }

}
