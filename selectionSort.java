//Brendan Loyd
//3130 Algorithms
//March 22nd 2021

//This file contains a selection sort sorting algorithm

package ProjTwo;

//Code inspiration from https://www.javatpoint.com/selection-sort-in-java
public class selectionSort {
    public static void selection_Sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
}
