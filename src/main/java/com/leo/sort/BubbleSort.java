package com.leo.sort;

public class BubbleSort extends Sort {
    @Override
    public void sort(int[] data) {
        final int length = data.length;
        for (int i = 0; i < length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swap(data, j, j + 1);
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "BubbleSort";
    }
}
