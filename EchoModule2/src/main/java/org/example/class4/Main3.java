package org.example.class4;

import java.util.Arrays;

class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        // Implement bubble sort logic
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String getAlgorithmName() {
        return "Bubble Sort";
    }
}

class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        // Implement merge sort logic
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    @Override
    public String getAlgorithmName() {
        return "Merge Sort";
    }
}

class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        // Implement quick sort logic
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    @Override
    public String getAlgorithmName() {
        return "Quick Sort";
    }
}

public class Main3 {
    public static void main(String[] args)
    {
        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm mergeSort = new MergeSort();
        SortingAlgorithm quickSort = new QuickSort();

        int[] arr = {5, 2, 9, 1, 5, 6};

        // Sort the array using different algorithms
        int[] arrBubble = arr.clone();
        bubbleSort.sort(arrBubble);

        int[] arrMerge = arr.clone();
        mergeSort.sort(arrMerge);

        int[] arrQuick = arr.clone();

        quickSort.sort(arrQuick);

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Bubble Sort: " + Arrays.toString(arrBubble));
        System.out.println("Merge Sort: " + Arrays.toString(arrMerge));
        System.out.println("Quick Sort: " + Arrays.toString(arrQuick));
    }
}
