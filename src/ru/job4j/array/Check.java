package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean etalon = data[0];
        for (boolean el: data) {
            if (el != etalon) {
                result = false;
            }
        }
        return result;
    }
}