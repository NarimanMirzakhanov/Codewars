import java.util.Arrays;

public class HighestScoringWord {
    public static String high(String s) {
        String[] arr = s.split("\\s");
        for (int i = 0; i < arr.length; i++) {

        }
//        if (arr[i] == )
//        int max = 0;
//        char[] c = s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            max += c[i];
//        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(high("man i need a taxi up to ubud"));
//        System.out.println(high("what time are we climbing up to the volcano"));
//        System.out.println(high("take me to semynak"));
//        System.out.println(high("aa b"));
//        System.out.println(high("b aa"));
//        System.out.println(high("bb d"));
//        System.out.println(high("d bb"));
//        System.out.println(high("aaa b"));
    }
}
