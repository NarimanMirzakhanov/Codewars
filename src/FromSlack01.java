public class FromSlack01 {
    public static void main(String[] args) {
        double cost = 59.0;
        int age = 90;
        if (age <= 5) {
            System.out.println("cost is free");
        } else {
            if (age >= 6 && age <= 15) {
                System.out.println("cost = " + ((double)cost / 100 * 20));
            } else {
                if (age >= 16 && age <= 40) {
                    System.out.println("cost = " + cost);
                } else {
                    if (age >= 41 && age <= 60) {
                        System.out.println("cost = " + cost / 100 * 33);
                    } else {
                        if (age >= 61 && age <= 80) {
                            System.out.println("cost = " + cost / 100 * 48);
                        } else {
                            System.out.println("cost = " + 0.02);
                        }
                    }
                }
            }
        }
    }
}
