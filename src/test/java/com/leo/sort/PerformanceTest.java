package com.leo.sort;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Ignore performance test due to time consuming")
public class PerformanceTest {
    @Test
    void test() {
        final BubbleSort bubbleSort = new BubbleSort();
        RunSort(bubbleSort);

        final SelectionSort selectionSort = new SelectionSort();
        RunSort(selectionSort);

        final InsertionSort insertionSort = new InsertionSort();
        RunSort(insertionSort);

        final MergeSort mergeSort = new MergeSort();
        RunSort(mergeSort);

        final QuickSort quickSort = new QuickSort();
        RunSort(quickSort);

        final RandomQuickSort randomQuickSort = new RandomQuickSort();
        RunSort(randomQuickSort);
    }

    private void RunSort(Sort sort) {
        System.out.printf("%15s: ", sort);
        final double avg = monteCarloSimulation(sort);
        System.out.printf("%5.2f ms\n", avg);
    }

    private double monteCarloSimulation(Sort sort) {
        final double T = 10000;
        double avg = 0;
        for (int i = 0; i < T; i++) {
            final double duration = run(sort);
            avg += duration;
            if (i % ((int) T / 5) == 0)
                System.out.printf("%s", "*");
        }
        return avg / T;
    }

    private double run(Sort sort) {
        final int[] data = createData();
        final long start = System.currentTimeMillis();
        sort.sort(data);
        final long end = System.currentTimeMillis();
        return end - start;
    }

    private int[] createData() {
        final int[] data = new int[1000];
        for (int i = 0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 100);
        }
        return data;
    }
}
