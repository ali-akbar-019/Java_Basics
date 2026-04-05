package day_12;

public class Question_02 {
    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        } else {
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(12);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}