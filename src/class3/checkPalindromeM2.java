package class3;
//Can check only word without space
interface chcPalindromNumber<S, B> {
    B methodPalindrom(S s);
}

public class checkPalindromeM2 {
    public static chcPalindromNumber<String, Boolean> plnCheckers = pln -> {
        String criteria = "";  //StringBuilder criteria = new StringBuilder();
        for (int a = pln.length() - 1; a >= 0; a--) {
            criteria += pln.charAt(a);  //criteria.append(pln.charAt(a));
        }
        return pln.equals(criteria);
    };

    public static void main(String[] args) {
        String str = "lol";
        System.out.println(plnCheckers.methodPalindrom(str));
    }
}


