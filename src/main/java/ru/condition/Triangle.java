package ru.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + bc > ac && bc + ac > ab && ac + ab > bc;
    }

    public static void main(String[] args) {
        System.out.println(exist(12.0, 13.0, 14.3));
    }
}
