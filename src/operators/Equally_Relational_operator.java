package operators;

public class Equally_Relational_operator {

    // == Equal to
    // != Not equal
    // > greater than
    // < less than
    // >= grater or equal
    // <= less or equal

    public static void main(String[] args) {

        int num1 = 30;
        int num2 = 40;
        int num3 = 30;

        if (num1 <= num2) {
            System.out.println("This is true");
        }
        if (num1 >= num2){
            System.out.println("This is False");
        }
        else {
            System.out.println("Else is correct");
        }


        if (num2 != num3) {
            System.out.println("This is good");
        } else {
            System.out.println("This is not good");
        }


    }

}
