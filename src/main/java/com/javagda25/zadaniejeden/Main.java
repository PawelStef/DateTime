package com.javagda25.zadaniejeden;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        manu();


    }

    public static void manu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz jakie dane o dacie chcesz uzyskać: ");
        System.out.println(" +++ możliwości: date, time, datetime +++");
        System.out.println(" +++ quit - jeżeli chcesz wyjść +++");
        String wpis = "";

        while (!wpis.equals("quit")) {
            wpis = scanner.nextLine();
            wpis = wpis.toLowerCase();
            switch (wpis) {
                case "date":
                    System.out.println("Data:");
                    LocalDate data = LocalDate.now();
                    System.out.println(data);
                    break;
                case "time":
                    System.out.println("Czas:");
                    LocalTime time = LocalTime.now();
                    System.out.println(time);
                    break;
                case "datetime":
                    System.out.println("Data i czas:");
                    LocalDateTime dateTime = LocalDateTime.now();
                    System.out.println(dateTime);
                    break;
                case "quit":
                    System.out.println("Ok narka.");

                    break;

                default:
                    System.out.println("złe polecenie, spróbuj jeszcze raz");
                    break;
            }


        }
    }
}
