package mysya.cat;

import java.util.List;

public class Human {  // это класс-модель (описание, чертёж человека)


  private static final String staticName = "Human"; // static значит — принадлежит классу


  // выразили три случайных типа данных
  // final → их нельзя будет поменять после создания
  private final String name;
  private final int age;
  private final boolean isCute;




  public Human(String name, int age, boolean isCute) { // создали конструктор с данными
    this.name = name;
    this.age = age;
    this.isCute = isCute;
  }


  // Добавили статический метод, можно вызвать без создания Human
  static void sayHello() {
    System.out.println("Hello, " + staticName);
}

  // Метод, который работает только если есть конкретный человек
  void sayHelloNonStatic() {
    System.out.println("Hello, " + this.name);
  }

  // Вместо того чтобы менять возраст старого объекта — создаём новый объект с возрастом +1
  public Human incrementAge() {
    return new Human(
        this.name,
        (this.age + 1),
        this.isCute
    );
  }


  // геттеры — способы безопасно посмотреть значения. Поля private → приходится спрашивать через методы
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isCute() {
    return isCute;
  }



  // Java передаёт в метод копию примитивов (int, boolean), и ссылку на объекты (List..)
  void printSomeValues(int i, String str, List<String> list) {
    i = 100; // ← это НЕ поменяет число снаружи!
    list.add("selenide"); // ← а это ПОМЕНЯЕТ список снаружи!
    System.out.println("int: " + i +
        ", string: "
        + str.toUpperCase() +
        ", list: " +
        list);
  }



  @Override  // вызвали метод toString, Override - перекрыли базовый метод своим
  public String toString() {
    return "Human{" + "name='" + name + '\'' + ", age=" + age + ", isCute=" + isCute + '}';

  }
}
