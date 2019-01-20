package pl.sda.sorting;

import java.util.Arrays;

/**
 * https://visualgo.net/en/sorting
 * https://www.youtube.com/watch?v=nmhjrI-aW5o
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arrayToSort[] = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
//        bubbleSort(arrayToSort);
        System.out.println("Sorted array: " + Arrays.toString(arrayToSort));

        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length - 1; j++) {
                if(arrayToSort[j] > arrayToSort[j + 1]){
                    SortingUtils.swap(arrayToSort,j + 1, j);
                }
            }
        }
    }
}
