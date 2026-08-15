package ru.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (nik >= ivan) {

            nik *= 2;
            ivan *= 3;
            month += 1;
        }
        return month;
    }

    public static void main(String[] args) {
        System.out.println("на "  + calc(100, 200) + " месяце");

    }

}
