package stepic.course;

public class String {}

  // Общий синтаксис для всех методов выглядит так:
  //  stringName.nameOfMethod();



  // 1) Возвращает длину строки str (количество символов, включая пробелы)
  // str.length();
  // String word = "Java is strong";
  // int x = word.length();
  // System.out.println(x);



  // 2) Сравнивает строки str1 и str2
  // str1.equals(str2);


 // Этот метод является булевым, то есть возвращает true, если строки равны, и false, если нет.
 // String word1 = "Java";
 // String word2 = "Python";
 // System.out.println(word1.equals(word2)); // false

 // String word3 = "Ja";
 // String word4 = "va";
 // boolean result = word1.equals(word3 + word4);
 // System.out.println(result); // true




// 3) Метод indexOf() ищет в строке заданный символ (или строку),
// и возвращает индекс его первого вхождения.
// Если элемент не найден, метод возвращает -1.

 // String word = "abracadabra";
 // int x = word.indexOf('b');
 // System.out.println(x); // 1

 // int y = word.indexOf('Z');
 // System.out.println(y); // -1



 // 4) Получение элемента строки по его индексу.
 // String word = "abracadabra";
 // char letter_0 = word.charAt(0);
 // System.out.println(letter_0); // a
 // char letter_4 = word.charAt(4);
 // System.out.println(letter_4); // c



 // 5) Проверка строки на пустоту
 // String str1 = "Hubba Bubba";
 // String str2 = "   ";
 // String str3 = "";

 // boolean value1 = str1.isEmpty(); // false
 // boolean value2 = str2.isEmpty(); // false
 // boolean value3 = str3.isEmpty(); // true


 // 6) Одна строка внутри другой
 // String str1 = "One Two Three";
 // String str2 = "One";
 // String str3 = "Four";
 // boolean value1 = str1.contains(str2); // true
 // boolean value1 = str1.contains(str3); // false


 // 7) Преобразование регистров
 // String s = "I'll be back";

 // System.out.println(s.toLowerCase()); // i'll be back
 // System.out.println(s.toUpperCase()); // I'LL BE BACK



 // 8) Представление числа в строковом формате
 // int n = 12345;                        Это число типа int
 // System.out.println(n);              // 12345

 // String str1 = Integer.toString(n);  // Это строка
 // System.out.println(str1);           // 12345

 // Integer num = n;                    // Это число-объект класса Integer
 //System.out.println(num);            // 12345

 // String str2 = num.toString();        // Это строка
 //System.out.println(str2);            // 12345



 // 9) Преобразование строки в число.
// Метод, обратный предыдущему - valueOf() преобразует строку в число нужного типа.

 // String str = "12345";
 // Integer num = Integer.valueOf(str);  // num - объект класса Integer
 // System.out.println(num);             // 12345

 // int num1 = num;                      // num1 - переменная типа int
 // System.out.println(num1);            // 12345


// Метод преобразования строки в число - parseInt(), также принадлежащий классу Integer
 // String str = "12345";

 // int num = Integer.parseInt(str);    //num - переменная типа int
 // System.out.println(num);            //12345



 // 10) Создание подстроки.
 // String str = "Добро пожаловать в мир Java!";
 //System.out.println(str.substring(6));         //пожаловать в мир Java!
 // System.out.println(str.substring(6, 15));     //пожаловат



 // 11) Замена элементов строки.
 // String str = "Добро пожаловать в мир Java!";
 // System.out.println(str.replace('о', 'А')); //ДАбрА пАжалАвать в мир Java!