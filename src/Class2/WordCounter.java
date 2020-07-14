package Class2;

import java.util.Arrays;

public class WordCounter {
    public static void main(String[] args) {
        String repeatedWords = "Three Swedish switched witches watch three Swiss Swatch watch switches. Which Swedish " +
                "switched witch watch which Swiss Swatch watch switch?";
        System.out.println(counterOfWord(repeatedWords));
    }

    public static int counterOfWord(String str) {
        return (int) Arrays.stream(str.split(" "))
                .filter(x -> x.equals("watch"))  //.contains("watch")
                .count();
    }
}


