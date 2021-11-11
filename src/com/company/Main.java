package com.company;
import java.io.*;
import java.nio.*;
import java.util.*;

/*
Напишите программу, читающую текст из System.in и выводящую в System.out
сумму всех встреченных в тексте вещественных чисел с точностью до шестого знака после запятой.
Числом считается последовательность символов, отделенная от окружающего текста пробелами или
переводами строк и успешно разбираемая методом Double.parseDouble.

Пример ввода 1: 1 2 3
Пример вывода 1: 6.000000


Пример ввода 2: a1 b2 c3
Пример вывода 2: 0.000000


Пример ввода 3:  -1e3 18 .111 11bbb
Пример вывода 3: -981.889000
 */

//PS: после ввода сначала ENTER потом Ctrl+D
public class Main {

    public static void main(String[] args) {
        double summ = 0;

        Scanner s= new Scanner(System.in);
        s.useLocale(Locale.US); //стандарт определения дробных чисел (. или ,)

        while (s.hasNext()) {
            if (s.hasNextDouble()) { //проверка Double ли следующий
                summ += Double.parseDouble(s.next()); //преобразуем считанную строку в double
            } else {
                s.next();
            }
        }
        System.out.printf("%.6f",summ); //формат вывода вещественное с точностью до 6 знака после ','

        s.close();
    }
}
