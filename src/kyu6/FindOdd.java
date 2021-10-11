package kyu6;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int number = 0;
        if (a.length == 1) {
            number = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if (a[0] != a[1]) {
                number = a[0];
            }
            if (a[a.length - 1] != a[a.length - 2]) {
                number = a[a.length - 1];
            }
            if (a[i - 2] == a[i - 1] && a[i - 1] == a[i] || a[i - 1] != a[i] && a[i - 1] != a[i - 2]) {
                number = a[i - 1];
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));
    }
}
