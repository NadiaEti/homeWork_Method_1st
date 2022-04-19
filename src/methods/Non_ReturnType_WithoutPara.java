package methods;

import homeWork_Method_1st.Non_Return_Type_WithoutPara;

//AccessModifier returnType methodName() {}
public class Non_ReturnType_WithoutPara {
    public void doSummation(){  // non_return type method
        int num1 = 20;
        int num2 = 50;
        int num3 = 80;
        int total = num1 + num2 +num3;
        System.out.println("Total summation value is " + total );
    }
    public int doSum(){  // return type method
        int num1 = 20;
        int num2 = 50;
        int num3 = 80;
        int total = num1 + num2 +num3;
        System.out.println("Total sum value is " + total );
        return total;
    }

    public void doDivision(){
        double salary1 = 20000;
        double salary = 50;
        System.out.println("Total value of Division is " + ( salary1/salary));
    }

    public void doDivision1(){
        float tax1 = 300.99f;
        float tax = 50f;
        float total = tax1/tax;
        System.out.println("Average tax is " +total);
}


    public static void main(String[] args) {
        Non_ReturnType_WithoutPara A = new Non_ReturnType_WithoutPara();
        A.doSummation();  // non_return type of value is not return anything but only printing the value

        //int num =  A.doSummation();// It shows error (I provided return type is int but value is void)and It is not returning anything
        //because it is void method but I put here int (I'm trying to assign the value)for return. that means I break the rules.

        System.out.println("***************************************");

        A.doSum(); //return type of method is return value
        int num1 = A.doSum();  // It return me tha value. It will give me int value.

        A.doDivision();

        A.doDivision1();
    }
}
