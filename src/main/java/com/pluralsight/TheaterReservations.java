package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Pattern;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner kbScanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        String name = "";
        LocalDate date;
        int tickets = 0;

        System.out.print("Please enter your name (First Last):  ");
        name = kbScanner.nextLine().trim();
        String[] nameSplit = name.split(Pattern.quote(" "));
        System.out.print("What date will you be coming? (MM/dd/yyyy): ");
        date = LocalDate.parse(kbScanner.nextLine().trim(), dateFormat);
        System.out.print("How many tickets would you like? ");
        tickets = kbScanner.nextInt();

        switch (tickets){
            case 1:
                System.out.println(tickets + " ticket reserved for " + date + " under " + nameSplit[1] + ", " + nameSplit[0] + ".");
                break;
            default:
                System.out.println(tickets + " tickets reserved for " + date + " under " + nameSplit[1] + ", " + nameSplit[0] + ".");
                break;
        }

    }
}
