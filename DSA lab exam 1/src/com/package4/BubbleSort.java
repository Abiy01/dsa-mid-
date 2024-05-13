package com.package4;

public class BubbleSort {

    public static void main(String[] args) {
        char[] arr = {'c', 'a', 'e', 'b', 'd'};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }


    public static void bubbleSort(char[] arr) {
        int n = arr.length;


        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;


            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }
        }
    }


    public static void printArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
