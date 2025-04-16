package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength6AndWidth8ThenDiagonal10() {
        double length = 6;
        double width = 8;
        double expected = 10.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength5AndWidth12ThenDiagonal11Dot31() {
        double length = 8;
        double width = 8;
        double expected = 11.31;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength7AndWidth4ThenDiagonal8Dot06() {
        double length = 7;
        double width = 4;
        double expected = 8.06;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
