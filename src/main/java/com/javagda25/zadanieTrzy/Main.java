package com.javagda25.zadanieTrzy;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy::MM::dd HH:mm");
        System.out.println("Podaj pierwszą datę w (format: YYYY::MM::DD)");
        String date1=scanner.nextLine();
        date1=date1+" 00:00";
        System.out.println("Podaj drugą datę w (format: YYYY::MM::DD)");
        String date2=scanner.nextLine();
        date2=date2+" 00:00";

        try {
            LocalDateTime localDateTime1 = LocalDateTime.parse(date1, dateTimeFormatter);

            LocalDateTime localDateTime2 = LocalDateTime.parse(date2, dateTimeFormatter);

            Period period = Period.between(localDateTime1.toLocalDate(),localDateTime2.toLocalDate());
            System.out.println("Minęło: "+period.getDays()+" dni "+period.getMonths()+" miesięcy "+period.getYears()+" lat");

        }catch (DateTimeParseException dtpe){
            System.out.println("Zły format daty");
        }


    }
}
