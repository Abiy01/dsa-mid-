package com.package6;

import java.util.Arrays;

public class ArrayManipulation {

    public static int[] deleteElement(int[] array, int index) {
        // Check if the index is valid
        if (index < 0 || index >= array.length) {
            System.out.println("Invalid index.");
            return array;
        }


        int[] newArray = new int[array.length - 1];


        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != index) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }


        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int indexToDelete = 2;

        System.out.println("Original Array: " + Arrays.toString(array));


        int[] modifiedArray = deleteElement(array, indexToDelete);

        System.out.println("Modified Array: " + Arrays.toString(modifiedArray));
    }
}
