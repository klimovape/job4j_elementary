package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And30Then3() {
        int x1 = 0, y1 = 0, x2 = 3, y2 = 0;
        double expected = 3.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus1And4And1Then6Dot32() {
        int x1 = -2, y1 = -1, x2 = 4, y2 = 1;
        double expected = 6.32;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And1And2Then5() {
        int x1 = -2, y1 = -2, x2 = 1, y2 = 2;
        double expected = 5.0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}