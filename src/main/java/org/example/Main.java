package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Выберите задачу ===");
            System.out.println("1. Площадь прямоугольника");
            System.out.println("2. Перевод температуры (Цельсий → Фаренгейт)");
            System.out.println("3. Перевод времени (минуты → часы и минуты)");
            System.out.println("0. Выход");

            int choice = InputHelper.readInt(scanner, "Ваш выбор: ");

            switch (choice) {
                case 1 -> RectangleArea.run(scanner);
                case 2 -> TemperatureConverter.run(scanner);
                case 3 -> TimeConverter.run(scanner);
                case 0 -> {
                    System.out.println("До свидания!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Ошибка: введите число от 0 до 3.");
            }
        }
    }
}
