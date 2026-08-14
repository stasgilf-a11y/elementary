package ru.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int summa = 0;
        for (int index = start; index <= finish; index++) {
            summa = summa + index;

        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(1, 1));
    }

}
