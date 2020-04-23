package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = p / (2 * (k + 1));
        double l = k * h;
        return h * l;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(4, 1);
        double result3 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 4, k = 4, s = 1, real = " + result2);
        System.out.println(" p = 5, k = 6, s = 1, real = " + result3);
    }
}