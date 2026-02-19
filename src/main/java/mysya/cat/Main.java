package mysya.cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {  // это класс с точкой входа (где начинается выполнение программы)

  public static void main(String[] args) { // это место, с которого обязательно стартует Java-программа

    // создали человека
    Human tanya = new Human(
        "Tatiana",
        21,
        true);


  // Демонстрация передачи параметров в метод
    List<String> lectures = new ArrayList<>(); // список с лекциями
    lectures.add("git");
    lectures.add("java");
    lectures.add("files");
    lectures.add("junit");



    // Set — коллекция уникальных элементов
    // Добавили в Set.of уникальные значения
    Set<String> lecturesSet = Set.of(
        "git", "java", "files", "junit"
    );


    // Map — коллекция «ключ → значение»
    // ключ (String) — уникальный идентификатор
    // значение (Human) — объект, который мы хотим найти по ключу
    Map<String, Human> humans = new HashMap<>();
    humans.put("673427234", tanya);
    humans.put("354543534", tanya);
    humans.put("675676565", tanya);
    humans.put("877687686", tanya);
    humans.put("234764777", tanya);
    humans.put("984564566", tanya);


  // Три способа перебрать Map в цикле
    // (ключ + значение сразу)
    for (Map.Entry<String, Human> entry : humans.entrySet()) {
      entry.getKey();
      entry.getValue();
    }

    // (только ключи)
    for (String key : humans.keySet()) {

    }
    // (только значения)
    for (Human value : humans.values()) {

    }


    int hours = 12;
    String hello = "Hello";

    tanya.printSomeValues(hours, hello, lectures);


  // Затем сразу после вызова печатаем значения снова:
    System.out.println("After method, int: " + hours); // всё ещё 12
    System.out.println("After method, String: " + hello); // всё ещё "Hello"
    System.out.println("After method, List: " + lectures); // уже 5 элементов!



    // Классические массивы. Обозначение типа массива
    String[] lecturesArray = new String[]{"git", "java", "files", "junit"}; // задали строго 4 элемента
    lecturesArray[0] = "git";
    lecturesArray[1] = "java";
    lecturesArray[2] = "files";
    lecturesArray[3] = "junit";



    // int[] — одномерный массив
    int[] intArray0 = new int[]{1, 2, 3};
    int[] intArray1 = new int[]{1, 2, 3};

    // двумерный массив (таблица)
    int[][] biArray0 = new int[][]{intArray0, intArray1};
    int[][] biArray1 = new int[][]{
        intArray0, intArray1};


    // int[][][] — трёхмерный массив
    int[][][] threeArray = new int[][][]{
        biArray0, biArray1};

    // Циклы for-each + continue + return
//        for (int i = 0; i < lecturesArray.length ; i++) {
//            System.out.println(lecturesArray[i]);
//        }
//
//        for (int i = lecturesArray.length - 1; i >= 0; i--) {
//            System.out.println(lecturesArray[i]);
//        }

    for (String lectureName : lecturesArray) {
      if (!lectureName.startsWith("j")) {
        continue; // пропустить итерацию, перейти к следующему элементу
      }
      System.out.println(lectureName);
      return; // ← немедленно выйти из метода main → программа завершится
    }

    // циклы while
//        int i = 0;                           (создаём счётчик i и ставим его в начало)
//        while (i < lecturesArray.length) {   (пока счётчик меньше длины массива — повторяем всё, что внутри {})
//            System.out.println(lecturesArray[i]); (печатаем элемент под номером i)
//            i++;                                  (увеличиваем счётчик на 1)
//        }
//

  }

}





