package ru.Training;

public class TrainTicket {
    Integer ticketNumber;
    String departure;
    String arrival;
    Integer trainNumber;
    String seatNumber;
    String dateAndTime;
    Double price;
    Boolean upperseat;
    String typeOfClass;
    String fullName;
    Integer age;

    public TrainTicket(int ticketNumber, String departure, String arrival, int trainNumber, String seatNumber, String dateAndTime, double price, boolean upperSeat, String typeOfClass) {
        this.ticketNumber = ticketNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
        this.dateAndTime = dateAndTime;
        this.price = price;
        this.upperseat = upperSeat;
        this.typeOfClass = typeOfClass;
        this.fullName = null;
        this.age = null;

    }

    public TrainTicket(Integer ticketNumber, String departure, String arrival, Integer trainNumber, String seatNumber, String dateAndTime, Double price, Boolean upperseat, String typeOfClass, String fullName, int age) {
        this.ticketNumber = ticketNumber;
        this.departure = departure;
        this.arrival = arrival;
        this.trainNumber = trainNumber;
        this.seatNumber = seatNumber;
        this.dateAndTime = dateAndTime;
        this.price = price;
        this.upperseat = upperseat;
        this.typeOfClass = typeOfClass;
        this.fullName = fullName;
        this.age = age;

    }

}