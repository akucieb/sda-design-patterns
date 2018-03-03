package pl.sda.poznan.builder;

public class Program {
    public static void main(String[] args) {
        String toParse = "Date, 2018-03-03, Headcount, 250, City, Poznan, Price, 100";
        Reservation myReservation = ReservationParser.parse(toParse);
        System.out.println(myReservation);
    }
}
