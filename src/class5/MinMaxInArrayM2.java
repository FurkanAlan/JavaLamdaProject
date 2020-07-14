package class5;

import java.util.Arrays;

interface maxFinderInArray<A, I> {
    I maxFunction(A a);
}

interface minFinderInArray<A, I> {
    I minFunction(A a);
}

public class MinMaxInArrayM2 {


    public static maxFinderInArray<int[], Integer> mxFinderInArr = arrayListMaxNumberFinder -> {
        return Arrays.stream(arrayListMaxNumberFinder)
                .max()
                .getAsInt();
    };

    public static minFinderInArray<int[], Integer> mnFinderInArr = arrayListMinNumberFinder -> {
        return Arrays.stream(arrayListMinNumberFinder)
                .min()
                .getAsInt();
    };


    static int[] arrayElements = {33, 45, 678, 9999, 11};

    public static void main(String[] args) {

        System.out.println(mxFinderInArr.maxFunction(arrayElements));

        System.out.println(mnFinderInArr.minFunction(arrayElements));

//        System.out.println(MaxFinder.mxFinderInArr.maxFunction(arrayElements));
//        System.out.println(MaxFinder.mnFinderInArr.minFunction(arrayElements));
    }
}

//class MaxFinder {
//    public static maxFinderInArray<int[], Integer> mxFinderInArr = arrayListMaxNumberFinder -> {
//        return Arrays.stream(arrayListMaxNumberFinder)
//                .max()
//                .getAsInt();
//    };
//
//    public static minFinderInArray<int[], Integer> mnFinderInArr = arrayListMinNumberFinder -> {
//        return Arrays.stream(arrayListMinNumberFinder)
//                .min()
//                .getAsInt();
//    };
//}
