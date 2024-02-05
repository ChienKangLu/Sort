package com.leo.sort;

public class QuickSort extends Sort {
    @Override
    public void sort(int[] data) {
        split(data, 0, data.length - 1);
    }

    private void split(int[] data, int start, int end) {
        if (start >= end) {
            return;
        }
        int center = partition(data, start, end);
        swap(data, start, center);
        split(data, start, center - 1);
        split(data, center + 1, end);
    }

    private int partition(int[] data, int start, int end) {
        int pivot = data[start];
        int center = start;
        for (int i = start + 1; i <= end; i++) {
            if (data[i] < pivot) {
                center += 1;
                swap(data, center, i);
            }
        }
        return center;
    }

    @Override
    public String toString() {
        return "QuickSort";
    }
}
