package com.company;

public class Main {

    public static int[] createArray(int length) {
        return new int[length];
    }

    public static void clearArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
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






    public static void main(String[] args) {
        // write your code here
    }
}
