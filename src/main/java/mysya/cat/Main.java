package mysya.cat;

import java.util.List;

public class Main { // без этого требования Java-программа не запустится

  public static void main(String[] args) { // массив строк
    System.out.println("Привет мир"); // вывод системы на печать

    
    // Целочисленные типы
    byte aByte = 0; // занимает 8b (бит) -128 + 127
    short aShort = 0; // занимает 16b (бит) -32768 + 32767
    int aInt = 0; // занимает 32b (бит) (-2^32) .. (+2^32 -1)
    long aLong = 0; // занимает 64b (бит)

    // Типы с плавающей точкой
    float aFloat = 0.0F;
    double aDouble = 0.0;
    Double doubleWrapper = 9.1; // Обёртка над типом

    // Символьный тип
    char aChar = 'a';
    Character charWrapper = 'a'; // Обёртка над типом

    // Логический тип
    boolean aBoolean = false;
    Boolean booleanWrapper = true; // Обёртка над типом

    // Строка
    String toBePrint = "Hello World"; // тип данных - строка, придумали название(переменная), присвоили значение Hello world!
    System.out.println(toBePrint); // присвоили переменную
    List<Integer> teachers = List.of(10, 20);


    // Составные типы данных. Описываем серую чашку с ручкой и объёмом в 250мл
    // struct Cup {
    // String color = "grey";
    // int capacity = 250;
    // boolean hasHandle = true; }


    // Операторы
    // Оператор присвоения =
    String name = "Hello";

    // Арифметические операторы + - * / % ++ --
    System.out.println(4.0 + 3);
    System.out.println(4.0 / 3);
    System.out.println(5 / 3);
    System.out.println(5 % 3);

    int result = aInt + 1; // потому что вверху есть (int aInt = 0)
    System.out.println(result);

    result = ++aInt; // ++ прибавляет единицу
    System.out.println(result);

    result = aInt - 1; // потому что вверху есть (int aInt = 0)
    System.out.println(result);

    result = --aInt; // -- отнимает единицу
    System.out.println(result);



    // Операторы сравнения <, >, <=, >=, !=, ==
    System.out.println(3 > 2);

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
