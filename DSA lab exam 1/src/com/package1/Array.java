package com.package1;
import java.util.Scanner;
public class Array {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = keyboard.nextInt();
        int[] array =new int[size];
        System.out.println(enterNumbers(array));



    }
     static int enterNumbers(int [] array){
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("enter first number " + (i+1) + ":");
            array[i] = keyboard.nextInt();
        }
        System.out.print("enter number to be searched: ");
        int num =keyboard.nextInt();
        int count = 0;
        for( int i =0; i< array.length;i++){
            if ( num == array[i]){
                count++;
                return count;
            }
        }
        return -1;


    }
    }


