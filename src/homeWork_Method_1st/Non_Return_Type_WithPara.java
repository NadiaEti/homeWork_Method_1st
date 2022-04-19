package homeWork_Method_1st;
public class Non_Return_Type_WithPara {

    public void doSummation(int num1,int num2,int num3){
        int total = num1 + num2 +num3;
        System.out.println("Total summation value is " + total );
    }

    public void doSub(int num3,int num2){
        int total =  num3 -num2;
        System.out.println("Total subtraction value is " + total );
    }

    public void doDivision( double salary, double salary2){
        double Division = salary/salary2;
        System.out.println("Total Division is " + Division);
    }

    public void doMulti(float tax1, float tax2, float tax3){
        float Multi = tax1 * tax2 * tax3;
        System.out.println("Average multiplication " + Multi);
    }

    public void doSubtraction(double rent, double rent1){
    double Sub = rent-rent1;
        System.out.println("Total rent " + Sub);
    }

    public static void main(String[] args) {

        Non_Return_Type_WithPara XXX = new Non_Return_Type_WithPara();
        XXX.doSummation(20,30,100);

        XXX.doSub(599,500);

        XXX.doDivision(50000,100);

        XXX.doMulti(20f,3.95f,50f);

        XXX.doSub(10000,2000);


    }
}
