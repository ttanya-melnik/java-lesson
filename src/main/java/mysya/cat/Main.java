package mysya.cat;

import java.util.List;

public class Main { // без этого требования Java-программа не запустится

  public static void main(String[] args) { // массив строк
    System.out.println("Привет мир");

    
    // Целочисленные типы
    byte aByte = 0; // занимает 8b (бит) -128 + 127
    short aShort = 0; // занимает 16b (бит) -32768 + 32767
    int aInt = 0; // занимает 32b (бит) -14 млрд.
    long aLong = 0; // занимает 64b (бит)

    // Типы с плавающей точкой
    float aFloat = 0.0F;
    double aDouble = 0.0;

    // Символьный тип
    char aChar = 'a';

    // Логический тип
    boolean aBoolean = false;

    // Строка
    String toBePrint = "Hello World"; // тип данных - строка, придумали название(переменная), присвоили значение Hello world!
    System.out.println(toBePrint); // присвоили переменную

    // Составные типы данных. Описываем коричневую чашку с ручкой и объёмом в 250мл
    // struct Cup {
    // String color = "grey";
    // int capacity = 250;
    // boolean hasHandle = true; }

    // Список строк
    // List<String> = List.of("Hello", "World");

    // Операторы
    // Оператор присвоения =
    String name = "Hello";

    // Арифметические операторы + - * / % ++ --
    // int result = aInt;

    // Операторы сравнения <, >, <=, >=, !=, ==

    // Логические операторы & (и), |(или), &&(сокращенное и), ||(сокращенное или), ^(аналог != - используется редко)
    // System.out.println(!(nameFirst.equals("Dmitrii")));

    // Оператор instanceof
    // System.out.println(nameFirst instanceof  String);

    // Тернарный оператор
    char sex = 'm';
    String childName = sex == 'm'
        ? "Valentin"
        : "Valentina";

    // Управляющая конструкция if
    if (sex == 'm') {
      childName = "Valentin";
    } else if (sex == 'w') {
      childName = "Valentina";
    } else {
      System.out.println("((");
    }

    // Ключевое слово new
    // String name = new String("Dima");

    }
  }
