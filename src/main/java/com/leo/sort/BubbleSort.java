package com.leo.sort;

public class BubbleSort extends Sort {
    @Override
    public void sort(int[] data) {
        while (true) {
            boolean flag = false;
            for (int i = 1; i < data.length; i++) {
                if (data[i - 1] > data[i]) {
                    swap(data, i - 1, i);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}
