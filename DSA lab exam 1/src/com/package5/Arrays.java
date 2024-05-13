package com.package5;



import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = keyboard.nextInt();
        int[] array = new int[size];
        int[] newArray = enterNumbers(array);
        mergeSort(newArray);


    }

    static int[] enterNumbers(int[] array) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0, j=0; i < array.length; i++) {
            System.out.print("enter first number " + (i + 1) + ":");
            array[i] = keyboard.nextInt();



        }
        int arr []= new int[array.length];
        for ( int i=0,j=0;i< array.length;i++){
            arr [j++] = array[i];
        }
        return arr;




    }

    static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }
        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[length - midIndex];


        for (int i = 0, j = 0; i < length; i++) {
            if (i < midIndex) {
                leftArray[i] = array[i];
            } else {
                rightArray[j++] = array[i];
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);


    }

    static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i++] = leftArray[l++];
            } else {
                array[i++] = rightArray[r++];
            }
        }
        while (l < leftSize) {
            array[i++] = leftArray[l++];
        }
        while (r < rightSize) {
            array[i++] = rightArray[r++];
        }
    }
}




