//Brendan Loyd
//3130 Algorithms
//March 22nd 2021

//This is the main file/method for my empirical analysis. This file contains main methods for creating arrays
//and calling methods of various sorting algorithms. Enjoy!

package ProjTwo;
import java.util.*;


public class empiricalAnalysis {

    public static void main(String[] args) {

        System.out.println("Test beginning, creating arrays..");
        //initialize arrays
        int[] randomArray1000 = constructRandomArray(1000);
        int[] randomArray10000 = constructRandomArray(10000);
        int[] randomArray100000 = constructRandomArray(100000);

        int[] sortedArray1000 = constructSortedArray(1000);
        int[] sortedArray10000 = constructSortedArray(10000);
        int[] sortedArray100000 = constructSortedArray(100000);

        int[] semiSortedArray1000 = constructSemiSortedArray(1000);
        int[] semiSortedArray10000 = constructSemiSortedArray(10000);
        int[] semiSortedArray100000 = constructSemiSortedArray(100000);

        System.out.println("Arrays created. Working on results...\n");


        long start = System.currentTimeMillis();
        selectionSort.selection_Sort(randomArray1000);
        long end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort sortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(sortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort sortedArray100000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        selectionSort.selection_Sort(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Selection sort semiSortedArray100000 result: " + end);

        randomArray1000 = constructRandomArray(1000);
        randomArray10000 = constructRandomArray(10000);
        randomArray100000 = constructRandomArray(100000);

        sortedArray1000 = constructSortedArray(1000);
        sortedArray10000 = constructSortedArray(10000);
        sortedArray100000 = constructSortedArray(100000);

        semiSortedArray1000 = constructSemiSortedArray(1000);
        semiSortedArray10000 = constructSemiSortedArray(10000);
        semiSortedArray100000 = constructSemiSortedArray(100000);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(randomArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort sortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(sortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort sortedArray100000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        insertionSort.insertion_Sort(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("Insertion sort semiSortedArray100000 result: " + end);

        randomArray1000 = constructRandomArray(1000);
        randomArray10000 = constructRandomArray(10000);
        randomArray100000 = constructRandomArray(100000);

        sortedArray1000 = constructSortedArray(1000);
        sortedArray10000 = constructSortedArray(10000);
        sortedArray100000 = constructSortedArray(100000);

        semiSortedArray1000 = constructSemiSortedArray(1000);
        semiSortedArray10000 = constructSemiSortedArray(10000);
        semiSortedArray100000 = constructSemiSortedArray(100000);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(randomArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps sortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(sortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps sortedArray100000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithoutSwaps(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithoutSwaps semiSortedArray100000 result: " + end);

        randomArray1000 = constructRandomArray(1000);
        randomArray10000 = constructRandomArray(10000);
        randomArray100000 = constructRandomArray(100000);

        sortedArray1000 = constructSortedArray(1000);
        sortedArray10000 = constructSortedArray(10000);
        sortedArray100000 = constructSortedArray(100000);

        semiSortedArray1000 = constructSemiSortedArray(1000);
        semiSortedArray10000 = constructSemiSortedArray(10000);
        semiSortedArray100000 = constructSemiSortedArray(100000);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(randomArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps sortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(sortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps sortedArray100000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        bubbleSort.bubbleSortWithSwaps(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("bubbleSortWithSwaps semiSortedArray100000 result: " + end);


        randomArray1000 = constructRandomArray(1000);
        randomArray10000 = constructRandomArray(10000);
        randomArray100000 = constructRandomArray(100000);

        sortedArray1000 = constructSortedArray(1000);
        sortedArray10000 = constructSortedArray(10000);
        sortedArray100000 = constructSortedArray(100000);

        semiSortedArray1000 = constructSemiSortedArray(1000);
        semiSortedArray10000 = constructSemiSortedArray(10000);
        semiSortedArray100000 = constructSemiSortedArray(100000);


        start = System.currentTimeMillis();
        QuickSort.startQuickSort(randomArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort sortedArray10000 result: " + end);
        try  {
            start = System.currentTimeMillis();
            QuickSort.startQuickSort(sortedArray100000);
            end = (System.currentTimeMillis() - start);
            System.out.println("QuickSort sortedArray100000 result: " + end);
        }catch(StackOverflowError error){
            System.err.println("An memory overload has occured.");
        }


        start = System.currentTimeMillis();
        QuickSort.startQuickSort(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        QuickSort.startQuickSort(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("QuickSort semiSortedArray100000 result: " + end);



        randomArray1000 =  constructRandomArray(1000);
        randomArray10000 = constructRandomArray(10000);
        randomArray100000 = constructRandomArray(100000);

        sortedArray1000 = constructSortedArray(1000);
        sortedArray10000 = constructSortedArray(10000);
        sortedArray100000 = constructSortedArray(100000);

        semiSortedArray1000 = constructSemiSortedArray(1000);
        semiSortedArray10000 = constructSemiSortedArray(10000);
        semiSortedArray100000 = constructSemiSortedArray(100000);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(randomArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort randomArray1000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(randomArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort randomArray10000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(randomArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort randomArray100000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(sortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort sortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(sortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort sortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(sortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort sortedArray100000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(semiSortedArray1000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort semiSortedArray1000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(semiSortedArray10000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort semiSortedArray10000 result: " + end);

        start = System.currentTimeMillis();
        mergeSort.startMergeSort(semiSortedArray100000);
        end = (System.currentTimeMillis() - start);
        System.out.println("mergeSort semiSortedArray100000 result: " + end);


    }

    public static int[] constructRandomArray(int length) {
        Random r = new Random();
        int[] array = new int[length];
        int minNumber = 1;
        int maxNumber = 10000;

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(maxNumber-minNumber) + minNumber;
        }

        return array;
    }

    public static int[] constructSortedArray(int length){
        int[] array = constructRandomArray(length);
        selectionSort.selection_Sort(array);
        return array;
    }

    public static int[] constructSemiSortedArray(int length){
        Random r = new Random();
        int minNumber = 1;
        int maxNumber = 10000;

        int[] array = constructSortedArray(length);
        for (int i = 9; i < length; i+=10) {
            array[i] = r.nextInt(maxNumber-minNumber) + minNumber;
        }

        return array;
    }
}
