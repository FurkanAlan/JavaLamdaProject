package class5;

import java.util.Arrays;
import java.util.stream.Collectors;

interface secMaxFinder<IARR, INN> {
    INN secondMaxFinder(IARR iaRR);
}

public class SecondMinMaxInArrayM2 {
    public static secMaxFinder<int[], Integer> findNumber = intArray -> {
        return Arrays.stream(intArray)
                .boxed()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList())
                .get(1);
    };

    public static void main(String[] args) {
        int[] arrayElm = {32, 34, 56, 789, 900, -112};
        System.out.println(findNumber.secondMaxFinder(arrayElm));
    }
}
