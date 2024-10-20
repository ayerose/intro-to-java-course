package com.cbfacademy.sort;

public class QuickSort implements ArraySorter {


    @Override
    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = partition(arr, startIndex, endIndex);
            // recursively sort the left partition
            sort(arr, startIndex, pivotIndex - 1);
            // recursively sort the right partition
            sort(arr, pivotIndex + 1, endIndex);
        }
    }

    // partition method for QuickSort
    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[endIndex];
        int boundaryIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex < endIndex; currentIndex++) {
            if (arr[currentIndex] <= pivot) {
                boundaryIndex++;
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        swap(arr, boundaryIndex + 1, endIndex);
        return boundaryIndex + 1;
    }

    // swap method to swap two elements in the array
    private void swap(int[] arr, int leftIndex, int rightIndex) {
        int temp = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }
}
