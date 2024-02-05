package com.leo.sort;

public class MergeSort extends Sort {
    @Override
    public void sort(int[] data) {
        split(data, 0, data.length - 1);
    }

    private void merge(int[] Array, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int idx = 0;
        int left = start;
        int right = mid + 1;
        while (left <= mid && right <= end) {
            if (Array[left] < Array[right]) {
                temp[idx] = Array[left];
                left++;
                idx++;
            } else {
                temp[idx] = Array[right];
                right++;
                idx++;
            }
        }
        while (left <= mid) {
            temp[idx] = Array[left];
            left++;
            idx++;
        }
        while (right <= end) {
            temp[idx] = Array[right];
            right++;
            idx++;
        }
        for (int i = 0; i < temp.length; i++) {
            Array[start + i] = temp[i];
        }

    }

    private void split(int[] Array, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        split(Array, start, mid);
        split(Array, mid + 1, end);
        merge(Array, start, mid, end);
    }

    @Override
    public String toString() {
        return "MergeSort";
    }

}
