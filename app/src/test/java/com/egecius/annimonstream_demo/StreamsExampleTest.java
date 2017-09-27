package com.egecius.annimonstream_demo;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class StreamsExampleTest {

    private StreamsExample mSut;

    @Before
    public void setUp() {
        mSut = new StreamsExample();
    }

    @Test
    public void list() {
        List<Integer> list = Arrays.asList(14, 7, 3);

        List<String> listResult = mSut.sortFilerAndMap(list);
        assertThat(listResult.size()).isEqualTo(2);
        assertThat(listResult.get(0)).isEqualTo("3");
        assertThat(listResult.get(1)).isEqualTo("7");
    }

}