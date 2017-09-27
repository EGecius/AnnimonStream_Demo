package com.egecius.annimonstream_demo.examples;


import com.annimon.stream.Optional;
import com.annimon.stream.function.Function;

public class OptionalExamples {

    Optional<String> map(Integer integer) {
        return Optional.ofNullable(integer)
                .map(new Function<Integer, String>() {
                    @Override
                    public String apply(Integer obj) {
                        return String.valueOf(obj);
                    }
                });

    }

    public Optional<String> flatMap(Integer integer) {
        return Optional.ofNullable(integer)
                .flatMap(new Function<Integer, Optional<String>>() {
                    @Override
                    public Optional<String> apply(Integer integer) {
                        return Optional.of(String.valueOf(integer));
                    }
                });
    }
}
