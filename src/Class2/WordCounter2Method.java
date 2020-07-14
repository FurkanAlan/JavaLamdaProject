package Class2;


import java.util.Arrays;

interface countingWords<A, B> {
    A counterFunction(B b);
}

public class WordCounter2Method {
    public static countingWords<Long, String> counting = s -> {
        return Arrays.stream(s.split(" "))
                .filter(abc -> abc.contains("watch"))
                .count();
    };

    public static void main(String[] args) {
        String str = "Three Swedish switched witches watch three Swiss Swatch watch switches. Which Swedish " +
                "switched witch watch which Swiss Swatch watch switch?";

        System.out.println(counting.counterFunction(str));

    }
}


//    public static countingWords<Integer, String> counting = (String s) -> {
//        return (int) Arrays.stream(s.split(" "))
//                .filter((String abc) -> {
//                    return abc.contains("watch");
//                })
//                .count();
//    };