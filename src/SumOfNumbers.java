public class SumOfNumbers {
    public static int GetSum(int a, int b) {
        int sum = (Math.abs(a - b) + 1) * (a + b) / 2;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(GetSum(-1,2));

    }
}
