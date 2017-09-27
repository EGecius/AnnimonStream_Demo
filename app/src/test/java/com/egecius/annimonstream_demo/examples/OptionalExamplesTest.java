package com.egecius.annimonstream_demo.examples;

import static org.assertj.core.api.Assertions.assertThat;

import com.annimon.stream.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class OptionalExamplesTest {

    private OptionalExamples mSut;

    @Before
    public void setUp() {
        mSut = new OptionalExamples();
    }

    @Test
    public void mapsToNumber() {
        Optional<String> optional = mSut.map(5);

        assertThat(optional.get()).isEqualTo("5");
    }

    @Test
    public void mapsToNull() {
        Optional<String> optional = mSut.map(null);

        assertThat(optional.isPresent()).isFalse();
    }

    @Test
    public void flatMapsToNumber() {
        Optional<String> optional = mSut.flatMap(5);

        assertThat(optional.get()).isEqualTo("5");
    }

    @Test
    public void flatMapsToNull() {
        Optional<String> optional = mSut.flatMap(null);

        assertThat(optional.isPresent()).isFalse();
    }

}