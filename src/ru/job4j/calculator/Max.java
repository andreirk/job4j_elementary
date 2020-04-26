package ru.job4j.calculator;

public class Max {

    public int max(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public int max(int first, int second, int third) {
        int temp = max(second, third);
        return max(first, temp);
    }
    public int max(int first, int second, int third, int fourth) {
        int temp = max(third, fourth);
        int temp2 = max(first, second);
        return max(temp, temp2);
    }
}
