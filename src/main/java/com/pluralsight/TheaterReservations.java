package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String event_Date = scanner.nextLine().trim();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate today = LocalDate.parse(event_Date, format);

        System.out.print("How many tickets would you like? ");
        double ticket_amount = scanner.nextInt();

        if (ticket_amount == 1){
            System.out.printf("%.0f ticket reserved for " + today + " under " + name.trim(),ticket_amount);
        } else {
            System.out.printf("%.0f tickets reserved for " + today + " under " + name.trim(),ticket_amount);
        }




    }
}
