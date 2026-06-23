# Java Basics — Конвертеры

![Java](https://img.shields.io/badge/Java-17%2B-orange?logo=openjdk)
![Maven](https://img.shields.io/badge/Maven-3.9-blue?logo=apachemaven)
![Last commit](https://img.shields.io/github/last-commit/DanielYaruta/practice-01-java-basics-git)
![Repo size](https://img.shields.io/github/repo-size/DanielYaruta/practice-01-java-basics-git)

Консольное приложение на Java с интерактивным меню для выполнения простых вычислений.

## Задачи

| # | Задача | Описание |
|---|--------|----------|
| 1 | Площадь прямоугольника | Вводишь длину и ширину — получаешь площадь |
| 2 | Перевод температуры | Цельсий → Фаренгейт |
| 3 | Перевод времени | Минуты → часы и минуты |

## Запуск

Требуется Java 17+ и Maven.

```bash
mvn compile exec:java -Dexec.mainClass=org.example.Main
```

## Структура

```
src/main/java/org/example/
├── Main.java                 # Точка входа, главное меню
├── InputHelper.java          # Утилиты для чтения и валидации ввода
├── RectangleArea.java        # Задача 1
├── TemperatureConverter.java # Задача 2
└── TimeConverter.java        # Задача 3
```
