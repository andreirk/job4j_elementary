package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Bob martin";
        names[1] = "Charly Livengston";
        names[2] = "Jhon Smit";
        names[3] = "Jhon Smit";

        for (String name: names) {
            System.out.println(name);
        }
    }
}
