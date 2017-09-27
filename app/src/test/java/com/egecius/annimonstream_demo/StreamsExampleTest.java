package com.egecius.annimonstream_demo;


import static android.R.id.list;

import static org.assertj.core.api.Assertions.assertThat;

import static java.util.Arrays.asList;

import com.annimon.stream.Optional;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamsExampleTest {

    private StreamsExample mSut;

    @Before
    public void setUp() {
        mSut = new StreamsExample();
    }

    @Test
    public void list() {
        List<Integer> list = asList(14, 7, 3);

        List<String> listResult = mSut.sortFilerAndMap(list);
        assertThat(listResult.size()).isEqualTo(2);
        assertThat(listResult.get(0)).isEqualTo("3");
        assertThat(listResult.get(1)).isEqualTo("7");
    }
    
    @Test
    public void forEach() {
        assertThat(mSut.getCounter()).isEqualTo(0);

        mSut.forEach(asList(1, 2, 3, 4));
        
        assertThat(mSut.getCounter()).isEqualTo(4);
    }

    @Test
    public void distinct() {
        List<Integer> list = mSut.distinct(asList(0, 1, 1, 1, 2, 2));

        assertThat(list.size()).isEqualTo(3);
        assertThat(list.get(0)).isEqualTo(0);
        assertThat(list.get(1)).isEqualTo(1);
        assertThat(list.get(2)).isEqualTo(2);
    }

    @Test
    public void findFirst_returnsFirstFoundValue() {
        Optional<Integer> optional = mSut.findFirst(asList(0, 1, 2));

        assertThat(optional.get()).isEqualTo(0);
    }

    @Test
    public void findFirst_returnsOptionalEmpty() {
        Optional<Integer> optional = mSut.findFirst(Collections.EMPTY_LIST);

        assertThat(optional.isPresent()).isFalse();
    }

}