package class5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondMinMaxInArrayM1 {

    public static int secondMinMaxFinder(int[] arrElements) {
        return Arrays.stream(arrElements)
                .boxed()
                .sorted((a, b) -> a.compareTo(b)) // (a, b) -> b.comparedTo(a)
                .collect(Collectors.toList())
                .get(arrElements.length - 2); //get(1) or to find max get(0)
    }

    public static void main(String[] args) {
        int[] arrayElm = {32, 34, 56, 789, 900, -112};
        System.out.println(secondMinMaxFinder(arrayElm));
    }

}
