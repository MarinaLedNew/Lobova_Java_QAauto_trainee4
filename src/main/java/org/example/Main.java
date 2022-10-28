package org.example;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {4, 10, 6, 2, 13, 12, 30};
        checkArray(array);

        var name = in.next();
        greetingForVyacheslav(name);

        int i = in.nextInt();
        hello(i);
    }

    public static void hello(int number) {
        if (number > 7) {
            System.out.println("Hello");
        }
    }

    public static void greetingForVyacheslav(String name) {
        var checkName = "Вячеслав";
        if (name.equals(checkName)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }


    public static void checkArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
    // Задание 4. [((())()(())]] - нет закрывающей круглой скобки и нет открывающей квадратной скобки. Надо первую закрывающую квадратную скобку изменить на закрывающую круглую.

}
