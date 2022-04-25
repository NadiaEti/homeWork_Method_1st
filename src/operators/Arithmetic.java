package operators;

public class Arithmetic {

    // + Addition Operator
    // - Subtraction Operator
    // * Multiplication Operator
    // / Division Operator
    // % Remainder Operator

    public static void main(String[] args) {
        int num = 200;
        int num2 = 300;

        int sum = num + num2;
        int sub = num - num2;
        int multi = num * num2;
        int division = num / num2;
        int remain = num % num2;  // 10/3= result 3 and remainder is 1

        System.out.println("value is " + sum);
        System.out.println("value is " + sub);
        System.out.println("value is " + multi);
        System.out.println("value is " + division);
        System.out.println("value is " + remain);
    }
}
