package com.javagda25.zadanieSzesc;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LocalDateTime start=LocalDateTime.now();
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy:MM:dd HH:mm");
        System.out.println("Podaj datę urodzenia (format: YYYY:MM:DD)");
        String bornDate=scanner.nextLine();
        bornDate=bornDate+" 00:00";

        try {
            LocalDateTime bornDateTime = LocalDateTime.parse(bornDate, dateTimeFormatter);
            Random generator = new Random();
            long randomYears = generator.nextInt(50);


            LocalDateTime deathDateTime = bornDateTime.plusYears(50L+randomYears);

            System.out.println("podaj płeć (m/w)");
            String sex = scanner.nextLine();
            sex=sex.toLowerCase();

            if (sex.equals("m")){
                deathDateTime=deathDateTime.minusYears(10L);
            }
            System.out.println("czy palisz papierosy?? (y/n)");
            String smoke = scanner.nextLine();
            smoke=smoke.toLowerCase();

            if (smoke.equals("y")){
                deathDateTime=deathDateTime.minusYears(9L);
                deathDateTime=deathDateTime.minusMonths(3L);
            }

            System.out.println("czy żyjesz w stresie?? (y/n)");
            String stres = scanner.nextLine();
            stres=stres.toLowerCase();

            if (stres.equals("y")){

                int losowaLiczba = generator.nextInt(100);
                if (losowaLiczba < 10) {
                    deathDateTime=bornDateTime.plusYears(60L);
                }

            }

            System.out.println("Data śmierci!!: "+deathDateTime.getMonth()+"-"
            +deathDateTime.getYear());



        }catch (DateTimeParseException dtpe){
            System.out.println("Zły format wpisanych komendy");
        }

        LocalDateTime end = LocalDateTime.now();

        Duration duration = Duration.between(start,end);
        System.out.println("Zmarnowałeś na to "+duration.getSeconds() +" sekund swojego cennnego życia ;)");
    }



}
