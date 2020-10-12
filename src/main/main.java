package main;

import bubblesort.BubbleSort;
import heapsort.HeapSort;
import insertionsort.InsertionSort;
import mergesort.MergeSort;
import quicksort.QuickSort;
import selectionsort.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("How many elements would you like in the array?: ");
        final Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] array = new int[numberOfElements];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println("UNSORTED ARRAY");
        System.out.println(Arrays.toString(array));
        System.out.println("Press 1 to sort this array using Bubble Sort");
        System.out.println("Press 2 to sort this array using Selection Sort");
        System.out.println("Press 3 to sort this array using Insertion Sort");
        System.out.println("Press 4 to sort this array using Quick Sort");
        System.out.println("Press 5 to sort this array using Merge Sort");
        System.out.println("Press 6 to sort this array using Heap Sort");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: /*BUBBLE SORT*/
                BubbleSort bubbleSort = new BubbleSort();
                bubbleSort.sort(array, (int) Math.ceil(Math.random()));
                System.out.println("ARRAY SORTED BY BUBBLE SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 2: /*SELECTION SORT*/
                SelectionSort selectionSort = new SelectionSort();
                selectionSort.sort(array);
                System.out.println("ARRAY SORTED BY SELECTION SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 3: /*INSERTION SORT*/
                InsertionSort.sort(array);
                System.out.println("ARRAY SORTED BY INSERTION SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 4: /*QUICK SORT*/
                QuickSort.sort(array, 0, array.length - 1);
                System.out.println("ARRAY SORTED BY INSERTION SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 5: /*MERGE SORT*/
                MergeSort.sort(array); // whether the method is static or not?
                System.out.println("ARRAY SORTED BY MERGE SORT");
                System.out.println(Arrays.toString(array));
                break;
            case 6: /*HEAP SORT*/
                HeapSort.sort(array);
                System.out.println("ARRAY SORTED BY HEAP SORT");
                System.out.println(Arrays.toString(array));
            default:
                break;
        }
        scanner.close();
    }
}