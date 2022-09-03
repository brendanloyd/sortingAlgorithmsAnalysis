//Brendan Loyd
//3130 Algorithms
//March 22nd 2021

//This file contains a quick sort sorting algorithm
package ProjTwo;
import java.util.*;

//Code inspiration from https://www.geeksforgeeks.org/quick-sort/
public class QuickSort {
    //selects last element as pivot, pi using which array is partitioned.
    int partition(int[] intArray, int low, int high) {
        int pi = intArray[high];
        int i = (low-1); // smaller element index
        for (int j=low; j<high; j++) {
            // check if current element is less than or equal to pi
            if (intArray[j] <= pi) {
                i++;
                // swap intArray[i] and intArray[j]
                int temp = intArray[i];
                intArray[i] = intArray[j];
                intArray[j] = temp;
            }
        }

        // swap intArray[i+1] and intArray[high] (or pi)
        int temp = intArray[i+1];
        intArray[i+1] = intArray[high];
        intArray[high] = temp;
        return i+1;
    }

    //routine to sort the array partitions recursively
    public void quick_sort(int[] intArray, int low, int high) {
            if (low < high) {

                    //partition the array around pi=>partitioning index and return pi
                    int pi = partition(intArray, low, high);
                    // sort each partition recursively
                    quick_sort(intArray, low, pi - 1);
                    quick_sort(intArray, pi + 1, high);
            }
    }

    public static void startQuickSort(int[] array) {
    QuickSort obj = new QuickSort();
    obj.quick_sort(array, 0, array.length - 1);
    }
}
