package kyu7;

public class LargestFiveDigitNumber {
    public static int solve(String digits) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < digits.length(); i++){
            if (Integer.parseInt(digits.substring(i, i + 5)) > max) {
                max = Integer.parseInt(digits.substring(i, i + 5));
            }
            if (i == digits.length() - 5) {
                return max;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(solve("283910"));
//        System.out.println(solve("1234567890"));
//        System.out.println(solve("731674765"));
//        System.out.println(solve("23468841248675465342"));
//        System.out.println(solve("57897465478974652316573416532419867543"));
//        System.out.println(solve("98765642"));
    }
}
