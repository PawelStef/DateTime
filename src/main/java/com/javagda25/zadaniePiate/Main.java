package com.javagda25.zadaniePiate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println("Podaj datę urodzenia (format: YYYY-MM-DD)");
        String date=scanner.nextLine();
        date=date+" 00:00";

        try {
            LocalDateTime bornDateTime = LocalDateTime.parse(date, dateTimeFormatter);

            LocalDateTime currentDateTime = LocalDateTime.now();

            Period period = Period.between(bornDateTime.toLocalDate(),currentDateTime.toLocalDate());
            System.out.println("Masz: "+period.getYears()+" lat "+period.getMonths()+" miesięcy "+period.getDays()+" dni ");
            Duration duration = Duration.between(bornDateTime, currentDateTime);
            System.out.println("Masz inaczej mówiąc "+duration.getSeconds()+ " sekund");




        }catch (DateTimeParseException dtpe){
            System.out.println("Zły format daty");
        }

    }
}
