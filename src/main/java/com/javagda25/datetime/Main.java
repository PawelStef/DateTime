package com.javagda25.datetime;

import java.time.*;


public class Main {
    public static void main(String[] args) {
        // źle!!!!!!!!

//        Date date = new Date();
//        System.out.println(date);
//
//        long milisecondsTill1970 = date.getTime();

        LocalDate data = LocalDate.now(); // obecna data!
        // 24.06.2019
        // 00:00:00 24.06.2019
        LocalDateTime dataICzasPoczatekDnia = data.atStartOfDay();
        // zamiast:
        LocalDateTime nowaDataICzas1 = LocalDateTime.of(data.getYear(), data.getMonth(), data.getDayOfMonth(), 0, 0);
        LocalDateTime nowaDataICzas2Grunwald = LocalDateTime.of(1410, 7, 15, 15, 0);

        LocalTime czas = LocalTime.now(); // obecny czas!
        LocalDateTime dataICzas = LocalDateTime.now();

        // Klasy reprezentujące odcinki czasu:
        Period okres = Period.between(nowaDataICzas2Grunwald.toLocalDate(),
                dataICzasPoczatekDnia.toLocalDate());

        System.out.println("Minelo: " + okres.getDays() + " " + okres.getMonths() + " " + okres.getYears());
        System.out.println(okres);

        Duration duration = Duration.between(nowaDataICzas2Grunwald, dataICzasPoczatekDnia);
        System.out.println(duration.getSeconds());
    }
}
