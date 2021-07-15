package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static void clearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static int getLength(int[] array) {
        return array.length;
    }

    public static void setElement(int[] array, int index, int value) throws Exception {
        if (index < 0 || index > array.length - 1) {
            throw new Exception("Выход за границы массивы");
        }

        array[index] = value;
    }

    public static int getElement(int[] array, int index) throws Exception {
        if (index < 0 || index > array.length - 1) {
            throw new Exception("Выход за границы массивы");
        }

        return array[index];
    }

    public static int[] add(int[] array, int value) {
        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }

        tempArray[tempArray.length - 1] = value;

        return tempArray;
    }

    public static int[] insert(int[] array, int index, int value) throws Exception {
        if (index < 0 || index > array.length - 1) {
            throw new Exception("Выход за границы массивы");
        }

        int[] tempArray = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            tempArray[i] = array[i];
        }

        tempArray[index] = value;

        for (int i = index; i < array.length; i++) {
            tempArray[i + 1] = array[i];
        }

        return tempArray;
    }


    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int action = -1;
        boolean isRun = true;
        int[] array = null;

        while (isRun) {

            System.out.println("Меню:");
            System.out.println("1. Создать массив");
            System.out.println("2. Обнулить массив");
            System.out.println("3. Вывести массив");
            System.out.println("4. Заполнить массив случайными значениями");
            System.out.println("5. Добавить элемент в конец массива");
            System.out.println("6. Добавить элемент в указанный индекс");
            System.out.println("0. Выход");

            System.out.print("Введите номер пункта меню: ");
            action = input.nextInt();

            switch (action) {
                case 1: {
                    System.out.print("Введите количество элементов массива: ");
                    int count = input.nextInt();

                    array = createArray(count);
                }
                break;

                case 2: {
                    clearArray(array);
                }
                break;

                case 3: {
                    for (int i = 0; i < getLength(array); i++) {
                        System.out.printf("%-5d", getElement(array, i));
                    }
                    System.out.println();
                }
                break;

                case 4: {
                    for (int i = 0; i < getLength(array); i++) {
                        setElement(array, i, random.nextInt(100));
                    }
                }
                break;

                case 5: {
                    System.out.print("Введите значение элемента массива: ");
                    int value = input.nextInt();

                    array = add(array, value);
                }
                break;

                case 6: {
                    System.out.print("Введите индекс элемента массива: ");
                    int index = input.nextInt();

                    System.out.print("Введите значение элемента массива: ");
                    int value = input.nextInt();

                    array = insert(array, index, value);
                }
                break;

                case 0:{
                    isRun = false;
                }
                break;

                default:{
                    System.out.println("Ошибка. Такой команды не существует");
                }
                break;
            }

        }
    }
}
