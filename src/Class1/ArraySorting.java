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

//:: is called Method Reference. It is basically a reference to a single method. i.e. it refers to an existing method by name. Method reference using :: is a convenience operator. Method reference is one of the features belonging to Java lambda expressions.Nov 19, 2014
//
//Meaning of :: in Java syntax - Stack Overflow
//        newFooterList.forEach(System.out::println);

//n method definition, ‘…’ represents an array. Which means if you define a method like:
//
//public static void input(String...array)
//{
//	System.out.println(array.length);
//}
//You can call the method like this:
//
//String[] array = {""};
//// Array with 0 element
//input();
//// Array with one element: ""
//input(array);
//// Array with 3 elements: "String 1", "String 2", "String 3"
//input("String 1", "String 2", "String 3");