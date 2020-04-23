package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double hipo1 = x2 - x1;
        double hipo2 = y2 - y1;
        double squareOfSum = Math.pow(hipo1, 2) + Math.pow(hipo2, 2);
        double rsl = Math.sqrt(squareOfSum);

        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(5, 6, 2, 3);
        double result3 = Point.distance(2, 11, 3, 8);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result ,(2 11), (3, 8) " + result3);
        System.out.println("result (5, 6), (2, 3) " + result2);
    }
}