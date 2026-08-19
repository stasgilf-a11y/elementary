package ru.Training;

public class Main1 {
    public static void main(String[] args) {
        TrainTicket fromMoscowtoSPBnoNameAndAge = new TrainTicket(213423, "Moscow", "Saint Petersburg", 432567, "42b", "22.11.2026. 15:30", 2000.0, false, "ecomomy");
        System.out.println("ticket number: " + fromMoscowtoSPBnoNameAndAge.ticketNumber);
        System.out.println("Departure from: " + fromMoscowtoSPBnoNameAndAge.departure);
        System.out.println("Arrival at : " + fromMoscowtoSPBnoNameAndAge.arrival);
        System.out.println("train number : " + fromMoscowtoSPBnoNameAndAge.trainNumber);
        System.out.println("seat number: " + fromMoscowtoSPBnoNameAndAge.seatNumber);
        System.out.println("departure date and time : " + fromMoscowtoSPBnoNameAndAge.dateAndTime);
        System.out.println("Ticket price : " + fromMoscowtoSPBnoNameAndAge.price + " rubles");
        System.out.println("Upper Seat : " + fromMoscowtoSPBnoNameAndAge.upperseat);
        System.out.println("type of class : " + fromMoscowtoSPBnoNameAndAge.typeOfClass);
        System.out.println("Passengers full name : " + fromMoscowtoSPBnoNameAndAge.fullName);
        System.out.println("Passengers age : " + fromMoscowtoSPBnoNameAndAge.age);

        TrainTicket fromMoscowtoSPBwithPassenger = new TrainTicket(213423, "Moscow", "Saint Petersburg", 432567, "42b", "22.11.2026. 15:30", 2000.0, false, "ecomomy", "Yuriev Yuriy Yurievich", 30);
        System.out.println();
        System.out.println("ticket number: " + fromMoscowtoSPBwithPassenger.ticketNumber);
        System.out.println("Departure from: " + fromMoscowtoSPBwithPassenger.departure);
        System.out.println("Arrival at : " + fromMoscowtoSPBwithPassenger.arrival);
        System.out.println("train number : " + fromMoscowtoSPBwithPassenger.trainNumber);
        System.out.println("seat number: " + fromMoscowtoSPBwithPassenger.seatNumber);
        System.out.println("departure date and time : " + fromMoscowtoSPBwithPassenger.dateAndTime);
        System.out.println("Ticket price : " + fromMoscowtoSPBwithPassenger.price + " rubles");
        System.out.println("Upper Seat : " + fromMoscowtoSPBwithPassenger.upperseat);
        System.out.println("type of class : " + fromMoscowtoSPBwithPassenger.typeOfClass);
        System.out.println("Passengers full name : " + fromMoscowtoSPBwithPassenger.fullName);
        System.out.println("Passengers age : " + fromMoscowtoSPBwithPassenger.age);
    }
}
