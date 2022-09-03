//Brendan Loyd
//3130 Algorithms
//March 22nd 2021

//This file contains a insertion sort sorting algorithm
package ProjTwo;
//Code inspiration from https://www.javatpoint.com/insertion-sort-in-java
public class insertionSort {

    public static void insertion_Sort(int[] array) {

        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }

    }
}
