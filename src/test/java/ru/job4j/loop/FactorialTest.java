package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenNumber0Then1() {
        int number = 0;
        double expected = 1;
        double output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenNumber1Then1() {
        int number = 1;
        double expected = 1;
        double output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenNumber25Then1dot551e25() {
        int number = 25;
        double expected = 1.5511210043330985984E+25;
        double output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}