package com.javarush.task.pro.task04.task0413;

/*
Рисуем треугольник
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            int count = 1 + i;
            for (int j = 0; j < count; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
