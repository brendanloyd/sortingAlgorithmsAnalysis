//Brendan Loyd
//3130 Algorithms
//March 22nd 2021

//This file contains a bubble sort with swaps counting and a bubble sort without swaps counting sorting algorithm
package ProjTwo;

//Code inspiration from https://www.geeksforgeeks.org/bubble-sort/
public class bubbleSort {

    public static void bubbleSortWithSwaps(int[] array) {
        int i, j, temp;
        int n = array.length;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

    //Code inspiration from https://www.geeksforgeeks.org/bubble-sort/
    public static void bubbleSortWithoutSwaps(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < (n-i-1); j++) {
                if (array[j] > array[j+1]) {
                    //swap elements
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
