package class5;

import java.util.Arrays;

public class MinMaxInArrayM1 {

    public static void main(String[] args) {
        int[] arrayList = {21000,-4500000,67,8900,1000};
        System.out.println(maxFinderArray.maxNumberGetterInArray(arrayList));
        System.out.println(maxFinderArray.minNumberGetterInArray(arrayList));
    }
}


class maxFinderArray {
    public static int maxNumberGetterInArray(int [] arList) {
        return Arrays.stream(arList)
                .max()
                .getAsInt();
    }

    public static int minNumberGetterInArray(int [] arList) {
        return Arrays.stream(arList)
                .min()
                .getAsInt();
    }
}
