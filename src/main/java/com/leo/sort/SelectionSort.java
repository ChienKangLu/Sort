package com.leo.sort;

public class SelectionSort extends Sort {
    public SelectionSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        for (int i = 0; i < data.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[index] > data[j]) {
                    index = j;
                }
            }
            swap(data, index, i);
        }
    }

    @Override
    public String toString() {
        return "SelectionSort";
    }

}
