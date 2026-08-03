package ru.calculator;

import ru.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return  MathFunction.dif(first, second)
                + MathFunction.div(first, second);
    }

    public static double allFourOperations(double sumAndMultiply, double difAndDiv) {
        return difAndDiv(10, 20) + sumAndMultiply(10, 20);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + difAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + allFourOperations(10, 20));

    }
}
