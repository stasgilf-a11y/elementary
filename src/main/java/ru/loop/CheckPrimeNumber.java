package ru.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;

        for (int index = 1; index <= number; index++) {

            if ((number % index == 0 && index != 1 && number != index) || number == 1) {
                prime = false;

            }

        }
        return prime;

    }

    public static void main(String[] args) {
        System.out.println(check(7));
        System.out.println(check(8));
        System.out.println(check(1));
    }

}
