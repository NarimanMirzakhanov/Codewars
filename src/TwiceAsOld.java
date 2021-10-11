public class TwiceAsOld {
    public static int TwiceAsOld(int dadYears, int sonYears) {
        double d = dadYears;
        double s = sonYears;
        int year = 0;
        for (int i = 0; i < 100; i++) {
            d += 1;
            s += 1;
            if (d / s == 2.0) {
                year = (int)(d - dadYears);
            }
        }
        d = dadYears;
        s = sonYears;
        if (year == 0) {
            for (int j = 100; j > 0 ; j--) {
                d -= 1;
                s -= 1;
                if (d / s == 2.0) {
                    year = (int)(dadYears - d);
                }
            }
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(TwiceAsOld(30, 0));
        System.out.println(TwiceAsOld(30, 7));
        System.out.println(TwiceAsOld(45, 30));
        System.out.println(TwiceAsOld(65, 38));
    }
}
