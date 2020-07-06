package Class1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 3, 5, 4, 11, 5, 6, 8, 9, 0};

        System.out.println(ArraySorter.sorterFunction(intArray));
        System.out.println(ArraySorter.sorterFunctionReversed(intArray));
    }

}

class ArraySorter {
    public static List<Integer> sorterFunctionReversed(int[] sortedArray) {
        return Arrays.stream(sortedArray)
                .boxed()
                .sorted(Comparator.reverseOrder()) // .sorted((x, y) -> y.compareTo(x))
                .collect(Collectors.toList());
    }

    public static List<Integer> sorterFunction(int[] sortedArray) {
        return Arrays.stream(sortedArray)
                .boxed()
                .sorted(Comparator.naturalOrder()) //or just .sorted()
                .collect(Collectors.toList());
    }
}