package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        for (int index = 0; index < array.length / 2; index++) {
            int firstIdx = index;
            int lastIdx = (array.length - 1) - index;
            temp = array[firstIdx];
            array[firstIdx] = array[lastIdx];
            array[lastIdx] = temp;
        }
        return array;
    }
}
