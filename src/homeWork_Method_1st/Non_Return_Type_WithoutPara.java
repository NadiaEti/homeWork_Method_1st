package homeWork_Method_1st;

public class Non_Return_Type_WithoutPara {

    public void doSummation(){
        int num1 = 20;
        int num2 = 50;
        int num3 = 80;
        int total = num1 + num2 +num3;
        System.out.println("Total summation value is " + total );
    }

    public void doDivision1(){
        float tax1 = 300.99f;
        float tax = 50f;
        float total = tax1/tax;
        System.out.println("Average tax is " +total);
    }

    public void doDivision(){
        double salary1 = 20000;
        double salary = 50;
        System.out.println("Total value of Division is " + ( salary1/salary));
    }

    public void doMulti(){
      int num1 = 25;
      int num2 = 30;
      int num3 = 50;
        System.out.println("The total multiplication value is " + (num1 * num2 * num3));
    }

    public void doSubtraction(){
        double item2 = 350;
        double item1 = 50;
        double total = item2-item1;
        System.out.println("Total sub " + total);
    }
    public static void main(String[] args) {
        Non_Return_Type_WithoutPara A = new Non_Return_Type_WithoutPara();
        A.doSummation();

        A.doDivision1();

        A.doDivision();

        A.doMulti();

        A.doSubtraction();
    }
}
