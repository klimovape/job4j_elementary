package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenStart1Finish3Then6() {
        int start = 1, finish = 3;
        double expected = 6;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.0));
    }

    @Test
    void whenStart7Finish3Then5() {
        int start = 7, finish = 5;
        double expected = 0;
        double output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected, withPrecision(0.0));
    }
}