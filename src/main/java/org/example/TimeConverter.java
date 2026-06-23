package org.example;

import java.util.Scanner;

public class TimeConverter {
    public static void run(Scanner scanner) {
        int totalMinutes = InputHelper.readNonNegativeInt(scanner, "Введите количество минут: ");
        System.out.println(totalMinutes / 60 + " часов " + totalMinutes % 60 + " минут");
    }
}
