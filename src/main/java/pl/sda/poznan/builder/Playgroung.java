package pl.sda.poznan.builder;

import java.time.LocalDate;

import pl.sda.poznan.builder.Reservation.ReservationBuilder;

public class Playgroung {
    public static void main(String[] args) {
        ReservationBuilder rb = Reservation.builder()
                .city("Poznan")
                .headcount(100)
                .price(99d);

        // odczyt z pliku
        rb.date(LocalDate.parse("2018-03-03"));

        //zakoncz proces budowania - zwroc gotowy obiekt
        Reservation build = rb.build();
        System.out.println(build);

        //inny scenariusz

        Reservation wroclaw = Reservation.builder()
                .date(LocalDate.parse("2018-03-03"))
                .headcount(100)
                .price(20)
                .city("Wroclaw")
                .build();



    }
}
