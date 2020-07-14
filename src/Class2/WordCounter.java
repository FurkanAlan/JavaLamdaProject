package Class2;

import java.beans.Expression;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordCounter {
    public static void main(String[] args) {
        String repeatedWords = "Three Swedish switched witches watch three Swiss Swatch watch switches. Which Swedish " +
                "switched witch watch which Swiss Swatch watch switch?";
        System.out.println(counterOfWord(repeatedWords));
    }

    public static long counterOfWord(String str) {
        return Arrays.stream(str.split(" "))
                .filter(x -> x.equals("watch"))  //.contains("watch")
                .count();
    }
}


//class testX {
//    public static long methodX(String  str) {
//        return Arrays.stream(str.split(" "))
//                .filter(x -> x.equals("ll"))
//                .count();
//    }
//}
