package ru.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= third && second >= first) {
            result = second;
        }
        if (third >= first && third  >= second) {
            result = third;
        }
        return result;
    }

}
