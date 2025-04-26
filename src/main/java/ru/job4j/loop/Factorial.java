package ru.job4j.loop;

public class Factorial {

    public static double calculate(int number) {
        double factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
