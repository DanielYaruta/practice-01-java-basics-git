package org.example;

import java.util.Scanner;

public class TemperatureConverter {
    public static void run(Scanner scanner) {
        double celsius = InputHelper.readDouble(scanner, "Введите температуру в градусах Цельсия: ");
        System.out.println("Температура в градусах Фаренгейта: " + (celsius * 9 / 5 + 32));
    }
}
