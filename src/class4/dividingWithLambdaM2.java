package class4;

interface divisionOp<I> {
    I divFunction(I i1, I i2);
}

//i1, i2 can be replaced for anything

//it is working for positive numbers and 0 division

public class dividingWithLambdaM2 {
    public static divisionOp<Integer> div = (i1, i2) -> {
        int rsl;
//        double rsl = Double.POSITIVE_INFINITY;
        if (i2 == 0) {
//            return rsl;
            System.out.println("Positive or Negative Infinity");
        }
        int counter = 0;
        while (i1 >= i2) {
            i1 = i1 - i2;
            counter++;
        }
        rsl = counter;
        return rsl;
    };

    public static void main(String[] args) {
        System.out.println(div.divFunction(8, 2));
    }
}
