public class FirstNonConsecutiveNumber {
    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] != 1) {
                return array[i + 1];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11}));
        System.out.println(find(new int[]{31, 32}));
        System.out.println(find(new int[]{-3, -2, 0, 1}));
    }
}
