package com.leo.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

abstract class BaseSortTest {
    final Sort tested;

    BaseSortTest(Sort sort) {
        tested = sort;
    }

    @Test
    void sort() {
        // GIVEN
        final int[] data = {5, 4, 3, 2, 1};

        // WHEN
        tested.sort(data);

        // THEN
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, data);
    }
}