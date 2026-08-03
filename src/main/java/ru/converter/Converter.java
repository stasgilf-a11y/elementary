package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    public static void main(String[] args) {
        float inEuro = 140;
        float expectedEuro = 1.4f;
        float outEuro = Converter.rubleToEuro(inEuro);
        boolean passed = expectedEuro == outEuro;
        System.out.println("140 rubles are 1.4. Test result : " + passed);
        float inDollar = 360;
        float expectedDollar = 3.0f;
        float outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar  == outDollar;
        System.out.println("180 rubles are 3.0. Test result: " + passed);
    }

}
