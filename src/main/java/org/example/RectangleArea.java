package org.example;

import java.util.Scanner;

public class RectangleArea {
    public static void run(Scanner scanner) {
        double length = InputHelper.readPositiveDouble(scanner, "Введите длину прямоугольника: ");
        double width = InputHelper.readPositiveDouble(scanner, "Введите ширину прямоугольника: ");
        System.out.println("Площадь прямоугольника: " + (length * width));
    }
}
