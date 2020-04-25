package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = 0; i < post.length; i++) {
            int indexFromEndOfWord = (word.length - 1) - i;
            int indexFromEndOfPost = (post.length - 1) - i;
            if (word[indexFromEndOfWord] != post[indexFromEndOfPost]) {
                result = false;
            }
        }
        // проверить. что массив word имеет последние элементы одинаковые с post
        return result;
    }
}