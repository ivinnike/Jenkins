package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        int a = -8;
        int b = 9;
        int times = 6;
        int year = 1956;
        String work = "Robot";
        System.out.println(sumwithin10and20(a, b));
        isPositiveOrNegative(a);
        System.out.println(isNegative(a));
        printWordNTimes(work,times);
        System.out.println(Leapyear(year));
    }

    public static boolean sumwithin10and20(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
        System.out.println();
    }

    public static boolean isNegative(int a) {
        return a<0;
    }
    public static void printWordNTimes(String work, int times) {
        for (int i = 1; i < times; i++) {
            System.out.println(work);
        }
        System.out.println();
    }
    public static boolean Leapyear(int year) {
        return (year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0));
    }
}

