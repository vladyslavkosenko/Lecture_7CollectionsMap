package com;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Map<LocalDate, String> lib = new HashMap<>();
        lib.put(LocalDate.of(2020, 10, 17), "Hary ");
        lib.put(LocalDate.of(2020, 10, 18), "Hary1 ");
        lib.put(LocalDate.of(2020, 10, 19), "Hary3 ");
        lib.put(LocalDate.of(2020, 10, 20), "Hary2 ");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the title of the book you would like to borrow");
        String newBook = in.nextLine();
        lib.put(LocalDate.now(), newBook);
        System.out.println("Great, you took the book " + newBook);
        try {


            System.out.println("Enter the year when you took the book in the format yyyy");
            int year = Integer.parseInt(in.nextLine());
            System.out.println("Enter the month when you took the book in the format mm");
            int month = Integer.parseInt(in.nextLine());
            System.out.println("Enter the day when you took the book in the format dd");
            int day = Integer.parseInt(in.nextLine());


            var date = LocalDate.of(year, month, day);
            if (lib.containsKey(date))
                System.out.println("Your book " + lib.get(date));
            else System.out.println("There is no such book");
        } catch (NumberFormatException e) {
            System.out.println("wrong character");

        }
    }
}
