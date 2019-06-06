package com.javagda25.zadanieDwa;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate datePlus = date.plusDays(10L);
        LocalDate dateMinus = date.minusDays(10L);
        System.out.println(dateMinus);
        System.out.println(datePlus);

    }
}
