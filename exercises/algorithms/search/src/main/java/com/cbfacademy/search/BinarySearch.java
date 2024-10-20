package com.cbfacademy.search;

public class BinarySearch implements Search {
    @Override
    public int search(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        // perform the binary search
        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArray[mid] == target) {
                return mid;  // if trarget found, return the index
            } else if (sortedArray[mid] < target) {
                low = mid + 1;  //  target is in the right half
            } else {
                high = mid - 1; //target is in the left half
            }
        }

        return -1;  //Target not found, return -1
    }
}
