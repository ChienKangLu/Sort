package com.leo.sort;

public class InsertionSort extends Sort {
    @Override
    public void sort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int unsorted = data[i];
            int insert = i;
            for (int j = i - 1; j >= 0; j--) {
                if (data[j] > unsorted) {
                    data[j + 1] = data[j];
                    insert = j;
                } else {
                    break;
                }
            }
            data[insert] = unsorted;
        }
    }

    @Override
    public String toString() {
        return "InsertionSort";
    }

}
