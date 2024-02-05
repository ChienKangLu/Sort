package com.leo.sort;

public abstract class Sort {
    int[] data;

    public Sort(int[] data) {
        this.data = data;
    }

    void swap(int[] data, int a, int b) {
        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }

    public abstract void sort();
}
