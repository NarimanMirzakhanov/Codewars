public class CockroachSpeed {
    public static int cockroachSpeed(double x) {
        int sec = 3600;
        int cm = 100000;
        double speed = x / sec * cm;
        return (int)speed;
    }

    public static void main(String[] args) {
        System.out.println(cockroachSpeed(1.08));
    }
}
