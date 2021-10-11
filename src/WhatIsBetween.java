import java.util.Arrays;

public class WhatIsBetween {

    public static int[] between(int a, int b) {
        int[] array = new int[b - a + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + a;
        }
        return array;
    }
    public static void main(String[] args) {
        System.out.println(between(1, 4));
        System.out.println(between(-2, 2));
    }
}
