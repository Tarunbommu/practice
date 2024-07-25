package day3;

//import java.util.Scanner;
public class MinMaxCircularSortedArray {

    public static void main(String[] args) {
        int[] arr = {23, 32, 41, 49, 7, 15, 21};

        Pair minMax = findMinMaxCircularSorted(arr);

        System.out.println("Minimum: " + minMax.first);
        System.out.println("Maximum: " + minMax.second);
    }

    public static Pair findMinMaxCircularSorted(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int pivot = 0;

        // Find the pivot point
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                pivot = (i + 1) % n;
                break;
            }
        }

        // Determine minimum and maximum
        if (pivot == 0) {
            // No rotation found, array is already sorted
            min = arr[0];
            max = arr[n - 1];
        } else {
            // Minimum is the element immediately after the pivot
            min = arr[pivot];
            // Maximum is the element immediately before the pivot
            max = arr[pivot - 1];
        }

        return new Pair(min, max);
    }

    // Helper class to return both minimum and maximum values
    static class Pair {
        int first;
        int second;

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
