package day_13;

public class Question_01 {
    public static void main(String[] args) {
        // Autoboxing - primitive to wrapper
        int a = 2;
        Integer b = a;
        System.out.println("Autoboxed value: " + b);

        // Unboxing - wrapper to primitive
        int c = b;
        System.out.println("Unboxed value: " + c);

        // parseInt - converts String to int
        String st = "12";
        int number = Integer.parseInt(st);
        System.out.println("Parsed int: " + number);

        // toString - converts Integer object to String
        String str2 = b.toString();
        System.out.println("toString result: " + str2);
    }
}