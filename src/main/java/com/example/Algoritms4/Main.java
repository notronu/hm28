package com.example.Algoritms4;

public class Main {
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    boolean isSorted(@org.jetbrains.annotations.NotNull int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            if (array[i] > array[i + 1]) {
                return false;
            }
            return true;
        }

        return false;
    }
}
