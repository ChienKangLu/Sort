package com.leo.sort;

public class SelectionSort extends Sort {
    @Override
    public void sort(int[] data) {
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
