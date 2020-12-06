package com.company;

public class Main {

    public static void main(String[] args) {
        main2();
        main3();
        main4();
        main5();
        main6();
        main7();

    // Задание 1
        double b = 10;
        for (int a = 0; a < 7; a++) {
            b = b + 10 + (b / 10);
        }
        System.out.println("Суммарный путь " + b + " км");
    }

    // Задание 2
    public static void main2() {
        // Задание 2
        int d = 1;
        for (int f = 3; f <= 24; f = f + 3) {
            d = d * 2;
            System.out.println("Колличество амёб на " + f + " часе = " + d);

        }

    }
    // Задание 3
    public static void main3() {
        int d = 1;
        for (
                int f = 1;
                f <= 256; f = f * 2) {
            d = d + d * 2;
        }
        System.out.println("Ответ " + d);
    }


    // Задание 4
    public static void main4() {
        int a = 5;
        int b = 7;
        int c = 0;

        for (
                int d = 1;
                d <= b; d++) {
            c = c + a;
        }
        System.out.println("A * B = " + c);
    }


    // Задание 5
    public static void main5() {
        double a;
        for (int d = 1; d <= 20; d++) {
            a = d * 2.54;
            System.out.println(d + " = " + a);
        }
    }


    // Задание 6
    public static void main6() {
        for (int d = 2; d <= 100; d = d + 2) {
            System.out.println(d);
        }
    }

    // Задание 7
    public static void main7() {
        int c = 0;
        for (int d = 1; d <= 99; d = d + 2) {
            c = c + d;
        }
        System.out.println(c);
    }

}




