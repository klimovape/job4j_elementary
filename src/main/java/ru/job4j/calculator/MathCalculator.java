package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
/**
 * И тут тоже пробую что-то кроме (двойной слеш даже внутри коммента бот мне забанил)
 */
public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double minusAndDivide(double first, double second) {
        return minus(first, second) + divide(first, second);
    }

    public static double sumOfAll(double first, double second) {
        return sumAndMultiply(first, second) + minusAndDivide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumOfAll(10, 20));
    }
}