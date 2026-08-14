package ru.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "monday";
                break;
            case 2:
                name = "tuesday";
                break;
            case 3:
                name = "wednesday";
                break;
            case 4:
                name = "thursday";
                break;
            case 5:
                name = "friday";
                break;
            case 6:
                name = "saturnday";
                break;
            case 7:
                name = "sunday";
                break;
            default:
                name = "error";
                break;

        }

        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(5));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(11));
    }

}
