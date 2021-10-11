public class FindTheUniqueNumber {
    public static double findUnique(double arr[]) {
        double unique = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[1] && arr[1] == arr[2]) {
                unique = arr[0];
            } else {
                if (arr[i - 1] != arr[i]) {
                    unique = arr[i];
                    break;
                }
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(findUnique(new double[]{0, 0, 2, 0, 0, 0}));
    }
}
